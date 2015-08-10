package observer;

public class ConcreteObserver implements Observer {
	private static int id;
	
	public ConcreteObserver() {
		id++;
	}
	
	@Override
	public void update(int v) {
		// TODO Auto-generated method stub
		System.out.println("Observer "+id+" reçoit la nouvelle valeur "+v);
	}

}
