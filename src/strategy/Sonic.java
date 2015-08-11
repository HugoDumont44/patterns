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
		strategy.execute();
	}
	
}
