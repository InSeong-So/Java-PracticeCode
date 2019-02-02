package practiceCode.thread._2;

public class ConsummerThread extends Thread {

	private DataBox dataBox;

	public ConsummerThread(DataBox dataBox) {

		// 공유 객체를 필드에 저장
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {

			// 새로운 데이터를 읽어옴
			String data = dataBox.getData();
		}
	}

}
