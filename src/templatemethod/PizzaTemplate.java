package templatemethod;

public abstract class PizzaTemplate {

	public final void makePizza(){
		prepareDough();
		putTomatoSauce();
		putTopping();
		addCheeze();
		bakePizza();
		System.out.println("Pizza is ready !");
	}
	
	private void prepareDough() {
		System.out.println("I'm doing dough for pizza");
	}
	
	private void putTomatoSauce() {
		System.out.println("spreading tomato sauce on it");
	}
	
	abstract void addCheeze();
	
	abstract void putTopping();
	
	private void bakePizza() {
		System.out.println("Pizza is baking");
	}
	
}
