package ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            //output은 파일이 없으면 만들어 준다.

            fos.write((char) 65);
            fos.write((char) 66);
            fos.write((char) 67);

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
