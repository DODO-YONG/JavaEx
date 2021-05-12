package com.practice.basic.reftypes;

public class EnumEx {
	
	public static void main(String[] args) {
		enumEx();
	}
	
	private static void enumEx() {
		//	ConditionalEx.switchEx3() -> enum버전
		Week today = Week.TUESDAY;
		String act = "";
		
		//	Mon ~ Thu : act < -열공
		//	Fri : act <- 불금
		//	Sat : act <- 주말
		//	Sun : act <- 휴식
		//	나머지 : act <- ?
		
		switch(today) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case TURSDAY:
			act = "열공";
			break;
		case FRIDAY:
			act = "불금";
			break;
		case SATURDAY:
			act = "주말";
		case SUNDAY:
			act = "휴식";
		default:
			act = "?";
		}
		System.out.printf("%s에는 %s%n", today.name(), act);
		
	}
}
