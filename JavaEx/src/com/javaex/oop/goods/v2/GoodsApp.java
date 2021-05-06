package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		//	setter를 이용한 우회 설
//		notebook.name = "LG gram";
//		notebook.price = 1500000;
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);	
		
		Goods smartphone = new Goods();
		smartphone.setName("Iphone");
		smartphone.setPrice(1000000);
		
		System.out.printf("%s, %d원%n",
				notebook.getName(), 
				notebook.getPrice());
		System.out.printf("%s, %d원%n",
				smartphone.getName(), 
				smartphone.getPrice());
		
		//	내장 메서드 호출
		notebook.showInfo();
		smartphone.showInfo();
	}

}
