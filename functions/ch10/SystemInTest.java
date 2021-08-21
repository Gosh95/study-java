package ch10;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void main(String[] args) {
        System.out.println("문장을 쓰고 [Enter]를 누르세요");

        int i;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            //한글 넣어도 안깨짐
            while ((i = isr.read()) != '\n') {
                System.out.print((char) i);
            }

            System.out.println();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("complete");
    }

}
