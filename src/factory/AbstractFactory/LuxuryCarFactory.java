package factory.AbstractFactory;

import factory.method.LuxuryCar;
import factory.model.AbstractCar;

public class LuxuryCarFactory implements ICarFactory{
	private String brand;
	private String model;
	private double enginePower;
	
	public LuxuryCarFactory(String brand, String model, double enginePower) {
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower/2;
	}

	@Override
	public AbstractCar getCar() {
		// TODO Auto-generated method stub
		return new LuxuryCar(brand, model, enginePower);
	}
}
