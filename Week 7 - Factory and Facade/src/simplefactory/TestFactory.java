package simplefactory;

public class TestFactory {

	public static void main(String[] args) {
		AbstractWeapon weapon = WeaponFactory.getWeapon(WeaponType.PISTOL, "black");
		weapon = WeaponFactory.getWeapon(WeaponType.MACHINE_GUN, "red");
		weapon = WeaponFactory.getWeapon(WeaponType.BAZOOKA, "blue");

	}

}
