package ch13;

public class MiddleLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 할 수 없습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("========= middle level =========");
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
        return 2;
    }

}
