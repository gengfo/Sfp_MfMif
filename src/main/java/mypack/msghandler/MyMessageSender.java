package mypack.msghandler;

import mypack.msg.schema.TestMsgEventDocument;
import mypack.msg.schema.TestMsgEventDocument.TestMsgEvent;
import mypack.msg.schema.TestMsgType;

import com.oocl.frm.mif.sender.MessageSenderFactory;
import com.oocl.frm.mif.sender.exception.MIFSenderException;

public class MyMessageSender {

	public void sendMessage() {

		new Thread() {
			public void run() {
				sendMessgae();
			}
		}.start();
	}

	private static void sendMessgae() {
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

}
