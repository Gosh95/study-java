package ch02;

public class CustomerTest {

    public static void main(String[] args) {
        VIPCustomer customerKim = new VIPCustomer();
        //하위 클래스를 생성하면 상위 클래스가 먼저 자동으로 생성된다.
        //	1. Customer() call   2. VIPCustomer() call

        System.out.println();

        VIPCustomer vipCustomer = new VIPCustomer(2, "name");
        // 1. Customer(int, String) call	2. VIPCustomer(int, String) call

        Customer vc = new VIPCustomer();
        // Customer 로 형변환. customer의 기능을 쓸 수가 있다.
    }

}
