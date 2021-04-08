package simplefactory;

public class WeaponFactory {
	public static AbstractWeapon getWeapon(WeaponType type, String Color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(Color, 100);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(Color);
			break;
		case BAZOOKA:
			weapon = new Bazooka(Color, 1000, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return weapon;
	}
}
