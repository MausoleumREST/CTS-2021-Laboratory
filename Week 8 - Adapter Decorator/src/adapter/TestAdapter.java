package adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		ACMECharacter dragon = new FantasyCharacter("Blue dragon", 1000);
		dragon.move();
		dragon.takeAHit(200);
		dragon.heal(100);
		
		DisneyActions donald = new DonaldDuck("Donald Duck", 500);
		donald.changeLocation(50, 50);
		donald.losePower(300);
		donald.recoverPower(300);
		
		//using the adapter
		ArrayList<ACMECharacter> characters = new ArrayList<>();
		characters.add(dragon);
		Disney2ACMEAdapter donaldAdapter = new Disney2ACMEAdapter(donald);
		characters.add(donaldAdapter);
		
		System.out.println("\n-----------------------\n");
		
		for(ACMECharacter hero : characters) {
			hero.move();
			hero.takeAHit(50);
		}
		
	}

}
