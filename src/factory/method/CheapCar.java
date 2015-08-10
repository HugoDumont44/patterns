package factory.method;

import factory.model.AbstractCar;

public class CheapCar extends AbstractCar {
	private String brand;
	private String model;
	private double enginePower;
	
	public CheapCar(String brand, String model, double enginePower){
		this.brand = brand;
		this.model = model;
		this.enginePower = enginePower/2;
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
