package observerJava;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer {

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if (obs instanceof DataStore){
			System.out.println("New value : "+((DataStore) obs).getData());
		}
	}

	
}
