package ch04;


public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");
        myQueue.enQueue("D");
        myQueue.enQueue("E");

        myQueue.showAll(); //A -> B -> C -> D -> E	-END

        myQueue.deQueue();
        myQueue.showAll(); //B -> C -> D -> E	-END

        myQueue.deQueue();
        myQueue.showAll(); //C -> D -> E	-END

        myQueue.deQueue();
        myQueue.showAll(); //D -> E	-END

        myQueue.deQueue();
        myQueue.showAll(); //E	-END

        myQueue.deQueue();
        myQueue.showAll(); //no data

    }

}
