package ch12;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelfList.add(title);
	}

	@Override
	public String deQueue() {
		return shelfList.remove(0);
	}

	@Override
	public int getSize() {
		return getShelfListSize();
	}

}
