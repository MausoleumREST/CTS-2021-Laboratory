package simplefactory;

public class Bazooka extends AbstractWeapon {

	public Bazooka(String color, int power, int distance) {
		super(color, power, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pewPew() {
		System.out.println("BOOM BOOM");

	}

}
