package factory.method;

import factory.model.AbstractCar;

public class LuxuryCar extends AbstractCar {
	private String brand;
	private String model;
	private double enginePower;
	
	public LuxuryCar(String brand, String model, double enginePower){
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower+100;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mon modèle "+brand+" ["+model+"] de puissance "+enginePower;
	}

	@Override
	public void ajoutPower(double a) {
		// TODO Auto-generated method stub
		this.enginePower += a;
	}
}
