package decorator;

import adapter.ACMECharacter;

public abstract class ACMEAbstractDecorator extends ACMECharacter {
	public ACMEAbstractDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifePoints());
	}

	ACMECharacter character = null;

	@Override
	public void move() {
		this.character.move();
		
	}
	
	@Override
	public int getLifePoints() {
		return this.character.getLifePoints();
		
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
		
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
		
	}
}
