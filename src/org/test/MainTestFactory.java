package org.test;

import factory.AbstractFactory.*;
import factory.method.MethodCarFactory;
import factory.model.AbstractCar;

public class MainTestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStaticMethodFactory();
		
		testAbstractFactory();
	}

	private static void testStaticMethodFactory() {
		AbstractCar porsche = MethodCarFactory.getCar(MethodCarFactory.LUXURY, "Porsche", "911", 500);
		AbstractCar twingo = MethodCarFactory.getCar(MethodCarFactory.CHEAP, "Renault", "Twingo", 40);
		
		System.out.println(porsche);
		System.out.println(twingo);
		
		porsche.ajoutPower(100);
		System.out.println(porsche);
	}
	
	private static void testAbstractFactory(){
		AbstractCar porsche = CarFactory.getCar(new LuxuryCarFactory("ferarri", "FXX", 600.0));
		AbstractCar autolib = CarFactory.getCar(new CheapCarFactory("Mairie de Nantes", "Margueritte", 50));
		
		System.out.println(porsche);
		System.out.println(autolib);
		
	}

}
