package com.practice.oop.casting;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		practice05();
		test5();

	}
	private static void test5() {
		int total = 0; 
		for(int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				total += i;
				System.out.println(i);
			}
		
		}
		System.out.println(total);
	}
	private static void practice05() {
		int scores[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 }
	};
		int total = 0;	//	점수 합계 저장 변수
//		배열 내 85점 이상 점수 합 구하기
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 5 ; j++ ) {
					total += scores[i][j];
					}
			}
			
			System.out.printf("총합은 %d%n", total);
	}

	public class Car{
		private String model;
		Car(String model) {
			this.model = model;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		
		
	}
	public static void test1() {
		int num = 120;
		int result = num >= 100 ? num -10 : num +10;
		System.out.println(result);
	}
	public static void test2() {
		HashSet<String> set = new HashSet<>();
		set.add("홍길동"); set.add("임꺽정");
		set.add("홍길동"); set.add("임꺽정");
		System.out.println(set.size());
	}
	public static void test3() {
		System.out.println("Exception 테스트시작");
		
		try {
			String test = null;
			System.out.println("문자열 길이 = " + test.length());
		}
		catch (NullPointerException ne) {
			System.out.println("Nullpointexcepton");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("Exception 테스트 종료");
	}

}
