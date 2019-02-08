package practiceCode.chapter07._01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바 스마트폰", "순백색", 10);

		// CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("컬러 : " + dmbCellPhone.color);

		// DmbCellPhone의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);

		// CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요! 처음 뵙겠습니다!");
		dmbCellPhone.sendVoice("네 반가워요!");
		dmbCellPhone.hangUp();

		// DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
