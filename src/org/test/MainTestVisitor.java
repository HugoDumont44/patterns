package org.test;

import visitor.*;

public class MainTestVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"),
					new Book(100, "5678"), new Fruit(10, 2, "Banana"),
					new Fruit(5, 5, "Apple") };
		int total = calculatePrice(items);
		System.out.println("--------------------------");
		System.out.println("Total cost = "+total+" $");
		System.out.println("--------------------------");
	}
	
	private static int calculatePrice(ItemElement[] items){
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
