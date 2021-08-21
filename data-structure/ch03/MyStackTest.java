package ch03;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.showList(); // 5 4 3 2 1

        myStack.pop();

        myStack.showList(); // 4 3 2 1

        myStack.popAll();

        myStack.showList(); // no data


    }

}
