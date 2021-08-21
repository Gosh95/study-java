package ch03;


import ch01.MyArrayList;

public class MyStack {
    MyArrayList myStack;
    int top;

    public MyStack() {
        top = 0;
        myStack = new MyArrayList();
    }

    public MyStack(int size) {
        top = 0;
        myStack = new MyArrayList(size);
    }

    //push
    public void push(int number) {
        if (isFull()) {
            System.out.println("not enough memory");
            return;
        }

        myStack.add(number);
        top++;
    }

    //pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("no data");
            return MyArrayList.ERROR_CODE;
        }

        return myStack.remove(--top);
    }

    //popAll
    public void popAll() {
        top = 0;
    }

    //showList
    public void showList() {
        int i = top;

        if (top == 0) {
            System.out.println("no data");
        }

        while (i != 0) {
            System.out.println(myStack.get(--i));
            System.out.println("ㅡ");
        }

        System.out.println();
    }

    //isFull
    public boolean isFull() {
        if (top >= myStack.ARRAY_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty() {
        if (top <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
