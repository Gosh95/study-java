package ch14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) {
        //읽고 쓰고 둘다 가능
        try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
            raf.writeInt(100);
            System.out.println("파일 포인터 위치:" + raf.getFilePointer());//byte 단위
            raf.writeDouble(3.14);
            System.out.println("파일 포인터 위치:" + raf.getFilePointer());
            raf.writeUTF("안녕하세요");
            System.out.println("파일 포인터 위치:" + raf.getFilePointer());

            raf.seek(0); //파일 포인터 위치를 처음으로
            System.out.println("파일 포인터 위치:" + raf.getFilePointer());

            int i = raf.readInt();
            double d = raf.readDouble();
            String str = raf.readUTF();

            System.out.println("파일 포인터 위치:" + raf.getFilePointer());
            System.out.println(i);
            System.out.println(d);
            System.out.println(str);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
