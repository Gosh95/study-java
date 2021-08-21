package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderTest {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("reader.txt")) {
            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
                //Hello World
            }

            System.out.println();
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
