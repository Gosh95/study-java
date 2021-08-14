 package ch07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt"); //no file
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			//return;
		} finally { 
//			finally : 블럭에서 파일를 닫거나 네트웍을 닫는 등의 리소스 해제 구현을 한다.
//			finally 블럭은 위에서 return이 되도 무조건 항상 수행한다.
//			여러개의 예외 블럭이 있을 때 각각 해제하지 않고 finally 블록에서 해제하도록 구현한다.
			if(fis != null) {
				try {
					fis.close();
				} catch(IOException e) {
					System.out.println(e);
				}
			}
			
			System.out.println("hello");
			//finally 구역 실행
		}
		
		System.out.println("complete");
		//여기도 실행
	}

}
