package ch07;

public class AutoCloseTest {

    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();

        try (obj) {
            //try with resources
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        System.out.println("complete");
    }

}
