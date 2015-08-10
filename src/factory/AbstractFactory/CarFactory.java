package factory.AbstractFactory;

import factory.model.AbstractCar;

public class CarFactory {
	private CarFactory(){}
	
	public static AbstractCar getCar(ICarFactory factory){
		return factory.getCar();
	}
}
