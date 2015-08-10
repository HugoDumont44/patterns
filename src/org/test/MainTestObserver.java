package org.test;

import observer.*;
import observerJava.DataStore;
import observerJava.Screen;

public class MainTestObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testObserver();
		
		testObserverJava();
	}
	
	private static void testObserver() {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();
		Observer observer3 = new ConcreteObserver();

		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.setValue(42);
	}
	
	private static void testObserverJava() {
		Screen screen = new Screen();
		DataStore ds = new DataStore();
		ds.addObserver(screen);
		ds.setData("Old value");
		ds.setData("New value");
	}

}
