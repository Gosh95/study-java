package ch01;

public class MyArrayList {
	int[] myArr;
	int count;
	
	public int ARRAY_SIZE;
	private final int ERROR_CODE = -999999;
	
	public MyArrayList() {
		count = 0;
		ARRAY_SIZE = 10;
		myArr = new int[ARRAY_SIZE];
	}
	
	public MyArrayList(int size) {
		count = 0;
		ARRAY_SIZE = size;
		myArr = new int[size];
	}
	
	//add
	public void add(int number) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		if(count == 0) {
			myArr[0] = number;
		}
		
		myArr[count++] = number;
	}
	
	//get
	public int get(int position) {
		return myArr[position];
	}
	
	//remove
	public int remove(int position) {
		int target;
		
		if(count == 0) {
			System.out.println("no data");
			return ERROR_CODE;
		}
		
		if(position < 0 || position >= count) {
			System.out.println("index error");
			return ERROR_CODE;
		}
		
		for(int i = position; i < count - 1; i++) {
			myArr[i] = myArr[i + 1];
		}
		
		target = myArr[position];
		
		count--;
		
		return target;
	}
	
	//insert
	public void insert(int position, int number) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		if(position < 0 || position > count) {
			System.out.println("index error");
			return;
		}
		
		for(int i = count - 1; i >= position; i--) {
			myArr[i + 1] = myArr[i];
		}
		
		myArr[position] = number;
		
		count++;
	}
	
	//sort
	public void sort() {
		for(int i = 0; i < count; i++) {
			for(int j = i; j < count; j++) {
				if(myArr[i] > myArr[j]) {
					int temp = myArr[j];
					myArr[j] = myArr[i];
					myArr[i] = temp;
				}
			}
		}
	}
	
	//show
	public void showList() {
		for(int i = 0; i < count; i++) {
			if(i == count - 1) {
				System.out.print(myArr[i]);
				break;
			}
			
			System.out.print(myArr[i] + " -> ");
		}
		
		System.out.println("\t-END");
	}
}
