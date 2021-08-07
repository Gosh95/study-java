package ch11;

public interface Sell {
	public void sell();
	
	default void sellBook() {
		System.out.println("sell book");
	}
}
