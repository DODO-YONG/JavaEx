package com.javaex.oop.point.v4;

//	상속 받기
public class ColorPoint extends Point {
	//	부모로부터 필드와 매서드를 상속받음
	private String color;
	//	생성자
	public ColorPoint(int x, int y, String color) {
		//	명시하지 않으면 부모의 기본 생성자를 선택
		super(x, y); 	//	명시적으로 부모 생성자호출
		this.color = color;
	}
	
	//	물려받은 멤버를 무시하고 자체적으로 재구
	@Override
	public void draw() {
		//	방법 1
//		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.n",
//				super.getX(), super.getY(), color);
		
		// 방법 2 부모의 필드 접근 제한자를 protect로 바꾼다.
		System.out.printf("색상점[x=%d, y=%d, color=%s]을 그렸습니다.n",
				x, y, color);
	}

	@Override
	public void draw(boolean show) {
		String message = String.format("색상점[x=%d, y=%d, color=%s]을",
				x, y,color);
		message += show ? "그렸습니다.": "지웠습니다.";
		System.out.println(message);
		
		//	override를 해도 부모의 메서드가 지워지는 것은 아니다.
		//	명시적으로 super 키워드를 이용해 부모의 멧드에 접근할 수 있다.
//		System.out.println("부모의 메서드 호출: ");
//		super.draw(show);
	}
	
}
