package Composite;

public class TestComposite {

	public static void main(String[] args) {
		Group group1 = new Group("Red team");
		group1.addNode(new NPC("Soldier1",100));
		group1.addNode(new NPC("Soldier2",100));
		
		Group group2 = new Group("Blue team");
		group1.addNode(new NPC("Soldier3",100));
		group1.addNode(new NPC("Tank",100));
		
		Group levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPC("Level BOSS",500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
	}

}
