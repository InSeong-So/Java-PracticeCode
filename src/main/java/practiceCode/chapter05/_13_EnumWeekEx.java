package practiceCode.chapter05;

import java.util.Calendar;

public class _13_EnumWeekEx {

	public static void main(String[] args) {
		_12_Week today = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = _12_Week.SUNDAY;
			break;
		case 2:
			today = _12_Week.MONDAY;
			break;
		case 3:
			today = _12_Week.TUSEDAY;
			break;
		case 4:
			today = _12_Week.WEDNESDAY;
			break;
		case 5:
			today = _12_Week.THURSDAY;
			break;
		case 6:
			today = _12_Week.FRIDAY;
			break;
		case 7:
			today = _12_Week.SATURDAY;
			break;
		}

		System.out.println("오늘 요일은 " + today + " 입니다.");

		if (today == _12_Week.SUNDAY) {
			System.out.println("일요일은 축구해요!");
		} else {
			System.out.println("공부합니다...");
		}

	}
}
