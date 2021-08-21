package ch12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

    public static void main(String[] args) {
        long millisecond = 0;
        //buffered - 입출력을 빠르게 도와주는 보조 스트림
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("book.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copied.txt"))) {
            millisecond = System.currentTimeMillis();

            int i;

            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(millisecond + "milli complete");
        //0milli complete
    }

}
