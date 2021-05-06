package com.javaex.oop.goods.v2;

//	v2.	정보 은닉
//		정보에 접근할 수 있는 특수 메서드 : getter / setter 설
public class Goods {
	//	필드(default: 내부 + 동일 패키)
	private String name;
	private int price;
	
	// 	Getter/Setter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//	메서드
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.println("가격:" + price);
	}
}
