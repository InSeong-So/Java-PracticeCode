package practiceCode.chapter05;

public class _14_EnumMethodEx {

	public static void main(String[] args) {
		// name() 메소드
		_12_Week today = _12_Week.SUNDAY;
		String name = today.name();
		System.out.println(name);

		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() 메소드
		_12_Week day1 = _12_Week.MONDAY;
		_12_Week day2 = _12_Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() 메소드
		if (args.length == 1) {
			String strDay = args[0];
			_12_Week weekDay = _12_Week.valueOf(strDay);
			if (weekDay == _12_Week.SATURDAY || weekDay == _12_Week.SUNDAY) {
				System.out.println("주말입니다.");
			} else {
				System.out.println("평일입니다.");
			}
		}

		// values() 메소드
		_12_Week[] days = _12_Week.values();
		for (_12_Week day : days) {
			System.out.println(day);
		}
	}
}
