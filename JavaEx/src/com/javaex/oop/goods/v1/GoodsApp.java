package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "LG gram";
		notebook.price = 1500000;
		
		Goods smartphone = new Goods();
		smartphone.name = "Iphone";
		smartphone.price = 1000000;
		
		System.out.printf("%s, %d원%n",
				notebook.name, 
				notebook.price);
		System.out.printf("%s, %d원%n",
				smartphone.name, 
				smartphone.price);
	}

}
