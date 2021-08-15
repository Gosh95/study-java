package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			
			while((i = fis.read()) != -1) {//-1 은 다 읽었다는 의미
				System.out.print((char)i);
			}
			
			System.out.println();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("complete");
	}

}
