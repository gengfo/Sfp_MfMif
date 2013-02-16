package mypack.msg.sender.decrator;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import com.oocl.frm.common.utils.StringUtils;
import com.oocl.frm.messaging.common.FWIMessageMetaData;
import com.oocl.frm.mif.constant.BasicConstants;
import com.oocl.frm.mif.data.MessageMetaData;
import com.oocl.frm.mif.data.transobj.TransportObject;
import com.oocl.frm.mif.exception.MIFDecorateException;
import com.oocl.frm.mif.helper.JAXBDecoratorHelper;
import com.oocl.frm.mif.mf.sender.decorator.AbstractToMFJmsSenderDecorator;
import com.oocl.frm.mif.mf.transobj.MFMessageObject;

public class DirectedJAXBXMLBeansToMFJmsSenderDecorator extends
		AbstractToMFJmsSenderDecorator {
	protected boolean needCheck = false;

	protected boolean useDefaultNameSpace = false;

	public boolean isNeedCheck() {
		return needCheck;
	}

	public void setNeedCheck(boolean needCheck) {
		this.needCheck = needCheck;
	}

	public boolean isUseDefaultNameSpace() {
		return useDefaultNameSpace;
	}

	public void setUseDefaultNameSpace(boolean useDefaultNameSpace) {
		this.useDefaultNameSpace = useDefaultNameSpace;
	}

	private static final String MESSAGE_SEND_TIMESTAMP = "messageSendTimeStamp";

	private static final String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";

	public TransportObject decorate(Object decorateObject,
			MessageMetaData metaData, List<String> infoMessages)
			throws MIFDecorateException {

		if (decorateObject instanceof XmlObject) {
			XmlObject xmlDoc = (XmlObject) decorateObject;
			// Validate the XML, collecting messages.
			JAXBDecoratorHelper.validateXmlBeansDoc(xmlDoc, this.needCheck,
					infoMessages);
			String message = null;
			XmlOptions xmlOptions = new XmlOptions();
			if (this.useDefaultNameSpace) {
				xmlOptions.setUseDefaultNamespace();
			}
			xmlOptions.setCharacterEncoding(BasicConstants.UTF_8_ENCODE);
			xmlOptions.setSaveAggressiveNamespaces();
			try {
				StringWriter writer = new StringWriter();
				xmlDoc.save(writer, xmlOptions);
				message = writer.toString();
			} catch (IOException e) {
				throw new MIFDecorateException("Save decorateObject "
						+ decorateObject + " to xml file fails!");
			}
			MFMessageObject mfMsgObject = this.assembleMFMessage(metaData,
					message);
			TransportObject transObject = new TransportObject(mfMsgObject, null);

			/* CR IPS6949 */
			mfMsgObject
					.getMessageMetaData()
					.getApplicationJMSHeaderMap()
					.addJMSHeader(
							MESSAGE_SEND_TIMESTAMP,
							DateUtils.formatDateToString(new Date(),
									TIME_PATTERN));

			/*
			 * Only messages whose property values match the selector are
			 * delivered. Message selectors cannot reference message body
			 * values.
			 */

			/*
			 * Since R2.1.x upgrade to mif to from r2.0.2 to r2.1
			 */
			if (metaData != null) {

				FWIMessageMetaData messageMetaData = mfMsgObject
						.getMessageMetaData();
				// the rootElement property will convert to jms properties
				// MF_RootElement and IR2NP_MessageType
				if (!StringUtils.isEmpty(metaData.getRecipientID())) {
					messageMetaData.setRootElement(metaData.getRecipientID());
				}
				// the rootElement property will override customer properties
				if (!StringUtils.isEmpty((String) metaData
						.getRuntimeMetaDatas().get("IR2NP_MessageType"))) {
					messageMetaData.setRootElement((String) metaData
							.getRuntimeMetaDatas().get("IR2NP_MessageType"));
				}

				messageMetaData.getApplicationJMSHeaderMap().getInternalMap()
						.putAll(metaData.getRuntimeMetaDatas());
			}

			return transObject;
		} else {
			throw new MIFDecorateException(
					"Parameter decorateObject must be a XmlBeans XmlObject class instance!");
		}
	}
}
