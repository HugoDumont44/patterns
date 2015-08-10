package factory.AbstractFactory;

import factory.method.CheapCar;
import factory.model.AbstractCar;

public class CheapCarFactory implements ICarFactory {
	private String brand;
	private String model;
	private double enginePower;
	
	public CheapCarFactory(String brand, String model, double enginePower) {
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower+10;
	}

	@Override
	public AbstractCar getCar() {
		// TODO Auto-generated method stub
		return new CheapCar(brand, model, enginePower);
	}
	
}
