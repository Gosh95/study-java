package ch13;

public class HighLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프를 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("========= high level =========");
    }

    @Override
    public void go(int count) {
        run();

        for (int i = 0; i < count; i++) {
            jump();
        }

        turn();

    }

    @Override
    public int getLevel() {
        return 3;
    }

}
