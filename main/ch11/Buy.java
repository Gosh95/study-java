package ch11;

public interface Buy {
    public void buy();

    default void buyBook() {
        System.out.println("buy book");
    }
}
