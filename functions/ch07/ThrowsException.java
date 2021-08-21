package ch07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
        //throws를 해서 예외 처리를 미룰 수 있다.
    }

    public static void main(String[] args) {
        ThrowsException te = new ThrowsException();
        //미뤄진 예외 처리하기

        try {
            te.loadClass("a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            //다른 예외가 발생할 경우 이쪽에서 처리
            //Exception은 모든 예외의 최상위이기 때문에 밑에 써야한다.
        }

        System.out.println("complete");

    }

}
