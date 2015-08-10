package templatemethod;

public class Pizza extends PizzaTemplate {

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void addCheeze() {
		// TODO Auto-generated method stub
		System.out.println("adding cheese");
	}

	@Override
	void putTopping() {
		// TODO Auto-generated method stub
		System.out.println("adding topping");
	}

}
