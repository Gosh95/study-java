package ch11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write("A");

            char[] ch = {'A', 'B', 'C', 'D', 'E'};

            fw.write(ch);

            fw.write(ch, 2, 3);

            fw.write("Hello Java");

            fw.write("123123");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("complete");
    }

}
