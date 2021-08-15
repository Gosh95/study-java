package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			
			int i;
			
			while((i = fis.read(bs, 0, 9)) != -1) {
								//offset
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				
				System.out.println(" : " + i + "byte");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		ABCDEFGHI : 9byte
//		JKLMNOPQR : 9byte
//		STUVWXYZ : 8byte
//		complete
		
		System.out.println("complete");
	}

}
