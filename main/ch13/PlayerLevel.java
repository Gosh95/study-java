package ch13;

public interface PlayerLevel {
    public void run();

    public void jump();

    public void turn();

    public void showLevelMessage();

    public void go(int count);

    public int getLevel();
}
