package org.test;

import org.singleton.EnumSingleton;
import org.singleton.SingletonWithHelper;
import org.singleton.Vendeur;

import templatemethod.Pizza;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vendeur v = Vendeur.getInstance();
		Vendeur y = Vendeur.getInstance();
		v.setNom("toto");
		v.setEmail("fff");
		v.setAdresse("yololo");
		
		v.affiche();
		
		y.setNom("/admin");
		y.setEmail("blabla");
		y.setAdresse("...");

		SingletonWithHelper s1 = SingletonWithHelper.getInstance();
		s1.singletonMethode();
		
		EnumSingleton.INSTANCE.singletonMethod();

		v.affiche();
		y.affiche();
		
		Pizza maPizza = new Pizza();
		maPizza.makePizza();
	}

}
