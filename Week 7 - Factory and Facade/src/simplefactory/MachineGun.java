package simplefactory;

public class MachineGun extends AbstractWeapon {

	public MachineGun(String color) {
		super(color, 500, 100);
	}
	
	@Override
	public void pewPew() {
		System.out.println("-> -> -> ->");
		
	}

}
