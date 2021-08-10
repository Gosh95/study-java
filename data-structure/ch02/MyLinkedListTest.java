package ch02;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add("a");
		myLinkedList.add("b");
		myLinkedList.add("c");
		myLinkedList.add("d");
		myLinkedList.add("e");
		
		myLinkedList.showList(); //a -> b -> c -> d -> e	-end
		
		myLinkedList.remove(0);
		
		myLinkedList.showList(); //b -> c -> d -> e	-end
		
		myLinkedList.insert(0, "a");
		
		myLinkedList.showList(); //a -> b -> c -> d -> e	-end

	}

}
