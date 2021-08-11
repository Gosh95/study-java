package ch04;

import ch02.MyLinkedList;
import ch02.MyNode;

interface IQueue {
	public MyNode enQueue(String data);
	public String deQueue();
	public void showAll();
}

public class MyQueue extends MyLinkedList implements IQueue {
	MyNode front;
	MyNode rear;
	
	public MyQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public MyNode enQueue(String data) {
		MyNode newNode;
		
		if(isEmpty()) {
			newNode = add(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = add(data);
			rear = newNode;
		}
		
		return newNode;
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("no data");
			return null;
		}
		
		String outData = front.getData();
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
		return outData;
	}

	@Override
	public void showAll() {
		if(isEmpty()) {
			System.out.println("no data");
			return;
		}
		
		MyNode tempNode = front;
		
		while(tempNode != null) {
			System.out.print(tempNode.getData());
			tempNode = tempNode.next;
			
			if(tempNode != null) {
				System.out.print(" -> ");
			} else {
				System.out.print("\t-END");
				break;
			}
		}
		
		System.out.println();
	}
	
	public boolean isEmpty() {
		if(front == null && rear == null) {
			return true;
		} else {
			return false;
		}
	}
}
