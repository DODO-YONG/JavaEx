package com.javaex.basics.Practice02;

public class Problem04 {

	public static void main(String[] args) {
		practice04();

	}
	private static void practice04() {

		int[] no = new int[6];
		int idx = 0;
		
		while (idx < no.length) {
			int choice = (int)(Math.random() * 45) + 1;
			boolean isDuplicated = false;	//	중복 체크를 위한 체크 변수
			
			//	중복 체크 로직 작성
			//	choice가 이미 no 배열에 담겨 있는지 확인하고 
			//	중복이 없는 경우, no 배열에 담는다
			
			no[idx] = choice;
			idx++;
	}

	for(int i = 0; i < no.length; i++){
	    System.out.print(no[i] + "  ");
	}
	System.out.println();
}
}