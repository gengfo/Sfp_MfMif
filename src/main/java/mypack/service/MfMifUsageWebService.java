package mypack.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import mypack.msg.schema.TestMsgEventDocument;
import mypack.msg.schema.TestMsgEventDocument.TestMsgEvent;
import mypack.msg.schema.TestMsgType;

import com.oocl.frm.mif.sender.MessageSenderFactory;
import com.oocl.frm.mif.sender.exception.MIFSenderException;

@WebService(serviceName = "MfMifUsageWebService", targetNamespace = "http://gengfo/ws/MfMifUsageWebService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class MfMifUsageWebService {

	public String sayHello(String name) {

		String result = HelloHelper.sayHello() + name;

		System.out.print(result);

		return result;

	}

	public void sendMessage() {

		new Thread() {
			public void run() {
				testSendMessgae();
			}
		}.start();

	}
	

	private static void testSendMessgae() {
		System.out
				.println("Testing MfMifUsageWebService testSendMessgae start ... ");

		TestMsgEventDocument doc = TestMsgEventDocument.Factory.newInstance();

		TestMsgEvent tme = doc.addNewTestMsgEvent();
		TestMsgType tmt = tme.addNewTestMsg();
		tmt.setSystemName("ARP");
		tmt.setContent("Content " + System.currentTimeMillis());

		try {

			MessageSenderFactory.getMessageSender().sendMessage(doc, "ARP",
					"TestMsgType", "TestMsgDestination");

		} catch (MIFSenderException e) {

			e.printStackTrace();
		}

		System.out
				.println("Testing MfMifUsageWebService testSendMessgae end ... ");

	}

	public void receiveMessage() {

		new Thread() {
			public void run() {
				testReceiveMessage();
			}
		}.start();

	}

	private static void testReceiveMessage() {
		System.out
				.println("Testing MfMifUsageWebService testReceiveMessage start ... ");
		
		

		System.out
				.println("Testing MfMifUsageWebService testReceiveMessage end ... ");

	}

}
