package simplefactory;

public class Pistol extends AbstractWeapon {

	public Pistol(String color, int power) {
		super(color, power, 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		System.out.println("---->");
		
	}

}
