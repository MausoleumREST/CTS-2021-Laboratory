package decorator;

import adapter.ACMECharacter;
import adapter.FantasyCharacter;

public class TestDeocarator {

	public static void main(String[] args) {
		ACMECharacter dragon = new FantasyCharacter("Blue dragon", 1000);
		dragon.move();
		dragon.takeAHit(200);
		dragon.heal(100);
		
//		ACMECharacter dragonWithArmor = new ArmorDecorator(dragon, 200);
//		dragonWithArmor.takeAHit(300); 
		
		dragon = new ArmorDecorator(dragon, 200);
		dragon.takeAHit(300);
		dragon.move();
	}

}
