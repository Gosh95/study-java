package ch06;

public class ComputerTest {

    public static void main(String[] args) {
        //abstract 클래스는 new 생성자로 생성할 수 없다. 상속만을 위해 존재!!
        Computer desktop = new Desktop();
        desktop.display(); //desktop display

        Computer mnb = new MyNoteBook();
        mnb.display(); //MyNoteBook display

    }
}
