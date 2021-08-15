package ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output2.txt")) {
													//파일명 뒤에 true면 이어쓰기 default : false - 겹쳐쓰기
			byte[] bs = new byte[26];
			
			byte a = 65;
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = a++;
			}
			
			fos.write(bs, 2, 10);
			//output2.txt : ABCDEFGHIJKLMNOPQRSTUVWXYZ
 		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("complete");
	}

}
