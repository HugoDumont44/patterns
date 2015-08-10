package strategy;

public class Sonic {

	private MoveCharacterStrategy strategy;

	public Sonic(MoveCharacterStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void changerStrategy(MoveCharacterStrategy strategy){
		this.strategy = strategy;
	}
	
	public void move() {
		System.out.println("Que fais-tu p�p�re ? ");
		strategy.execute();
	}
	
}
