package org.test;

import strategy.LucridousSpeedStrategy;
import strategy.MoveCharacterStrategy;
import strategy.SlowlyStrategy;
import strategy.Sonic;

public class MainTestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveCharacterStrategy strategy = new SlowlyStrategy();
		Sonic character = new Sonic(strategy);
		testStrategy(character);
	}
	
	private static void testStrategy(Sonic character) {
		System.out.println("Beginning");
		character.move();
		character.changerStrategy(new LucridousSpeedStrategy());
		character.move();
		character.changerStrategy(new SlowlyStrategy());
		character.move();
		System.out.println("The end");
	}

}
