package ch02;

public class MyNode {
    private String data;
    public MyNode next;

    public MyNode() {
        this.data = null;
        this.next = null;
    }

    public MyNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyNode(String data, MyNode link) {
        this.data = data;
        this.next = link;
    }

    public String getData() {
        return data;
    }
}
