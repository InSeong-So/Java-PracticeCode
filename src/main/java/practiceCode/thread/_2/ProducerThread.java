package practiceCode.thread._2;

public class ProducerThread extends Thread {

	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {

		// 공유 객체를 필드에 저장
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data - " + i;

			// 새로운 데이터를 저장
			dataBox.setData(data);
		}
	}
}
