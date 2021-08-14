package ch07;

public class ArrayIndexException {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
		ArrayIndexException.showList(arr);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//Index 5 out of bounds for length 5
		}
		
		System.out.println("complete exception handling");
		//complete exception handling
		//오류를 처리하면 밑으로 실행이 잘 된다.
	}
	
	static void showList(int[] arr) {
		//일부러 에러 나오는 메서드
		for(int i = 0; i <= arr.length; i++) { 
			System.out.println(arr[i]);
		}
	}

}
