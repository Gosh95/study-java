package ch13;

public class Player {
    String name;
    int level;
    PlayerLevel playerLevel;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        playerLevel = new LowLevel();
        playerLevel.showLevelMessage();
        System.out.println(this.name + "님은 현재 " + this.level + "레벨 입니다.");
    }

    ;

    public PlayerLevel getLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        this.level = playerLevel.getLevel();
        playerLevel.showLevelMessage();
        System.out.println(this.name + "님은 현재 " + this.level + "레벨 입니다.");
    }

    public void play(int count) {
        playerLevel.go(count);
    }
}
