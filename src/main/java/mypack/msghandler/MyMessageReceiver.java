package mypack.msghandler;

public class MyMessageReceiver {

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
