package ch13;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player("kim");
		player.play(1);
		
		player.upgradeLevel(new MiddleLevel());
		player.play(1);
		
		player.upgradeLevel(new HighLevel());
		player.play(1);
	}

}
