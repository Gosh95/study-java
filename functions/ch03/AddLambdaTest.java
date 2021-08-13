package ch03;

interface Add {
	public int add(int x , int y);
}

public class AddLambdaTest {

	public static void main(String[] args) {
		Add add = (x, y) -> x + y;
		
		int total = add.add(10, 20);
		
		System.out.println(total); //30
	}

}
