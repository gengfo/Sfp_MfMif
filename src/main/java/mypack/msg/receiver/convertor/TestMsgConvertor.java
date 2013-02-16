package mypack.msg.receiver.convertor;

import com.oocl.frm.mif.data.MessageMetaData;
import com.oocl.frm.mif.exception.MIFConvertException;
import com.oocl.frm.mif.receiver.converter.ReceiverConverter;
import com.oocl.frm.mif.sender.converter.SenderConverter;

public class TestMsgConvertor implements ReceiverConverter, SenderConverter{

	public Object toMessageBody(Object businessObject)
			throws MIFConvertException {
		// TODO Auto-generated method stub
		return businessObject;
	}

	public Object assemble(Object messageBody, MessageMetaData metaData)
			throws MIFConvertException {
		// TODO Auto-generated method stub
		return messageBody;
	}

	public Object toBusinessObject(Object convertObject,
			MessageMetaData metaData) throws MIFConvertException {
		// TODO Auto-generated method stub
		return convertObject;
	}

}
