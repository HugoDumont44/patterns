package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	private int value;
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unRegister(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers){
			observer.update(value);
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
	
}
