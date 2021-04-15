package adapter;

public abstract class ACMECharacter {
	
	protected String name;
	protected int lifePoints;
	
	protected ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	public void move() {};
	public void takeAHit(int points) {};
	public void heal(int points) {};

}
