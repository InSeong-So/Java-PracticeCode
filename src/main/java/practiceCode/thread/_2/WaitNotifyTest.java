package practiceCode.thread._2;

public class WaitNotifyTest {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsummerThread consummerThread = new ConsummerThread(dataBox);

		producerThread.start();
		consummerThread.start();
	}
}
