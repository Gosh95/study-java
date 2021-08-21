package ch03;

public class VariableTest {

    public static void main(String[] args) {
        byte bNum = 127;

        System.out.println(bNum);

        // int num = 12345678900;
        // 숫자는 기본 4바이트로 잡히기 때문에 큰 숫자는 long을 쓰고 뒤에 L을 붙여준다.
        long lNum = 12345678900L;

        System.out.println(lNum);
    }

}
