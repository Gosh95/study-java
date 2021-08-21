package ch07;

public class AutoCloseObj implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("closing.....");
    }

}
