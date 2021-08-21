package ch02;

public class MyLinkedList {
    private MyNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    //add
    public MyNode add(String data) {
        MyNode newNode = new MyNode(data);

        if (head == null) {
            head = newNode;
        } else {
            MyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        count++;

        return newNode;
    }

    //insert
    public MyNode insert(int index, String data) {
        MyNode newNode = new MyNode(data);
        MyNode tempNode = head;

        if (index >= count || index < 0) {
            System.out.println("index error");
            return null;
        }

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyNode preNode = null;
            for (int i = 0; i < index; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }

        count++;

        return newNode;
    }

    //remove
    public MyNode remove(int index) {
        MyNode tempNode = head;

        if (head == null) {
            System.out.println("no data");
        }

        if (index >= count || index < 0) {
            System.out.println("index error");
            return null;
        }

        if (index == 0) {
            head = tempNode.next;
        } else {
            MyNode preNode = null;
            for (int i = 0; i < index; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }

        count--;

        return tempNode;
    }

    //removeAll
    public void removeAll() {
        head = null;
        count = 0;
    }

    //get
    public String get(int index) {
        MyNode tempNode = head;

        if (index < 0 || index >= count) {
            System.out.println("index error");
            return null;
        }

        if (index == 0) {
            return head.getData();
        } else {
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.next;
            }

            return tempNode.getData();
        }
    }

    //showList
    public void showList() {
        if (count == 0) {
            System.out.println("no data");
            return;
        }

        MyNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getData());
            tempNode = tempNode.next;
            if (tempNode != null) {
                System.out.print(" -> ");
            } else {
                System.out.print("\t-end");
            }
        }

        System.out.println();
    }

}
