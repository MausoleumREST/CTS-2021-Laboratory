package factorymethod;

import simplefactory.AbstractWeapon;
import simplefactory.Pistol;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isWaterModeSet = true;
		if (isWaterModeSet) {
			//Code the game using water weapons
			AbstractWeapon pistol = new WaterPistol("Grey", 200, 0);
			
		}
		else
		{
			//code the game using real weapons
			AbstractWeapon pistol = new Pistol("Grey", 0);
		}
	}

}
