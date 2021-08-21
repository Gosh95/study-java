package ch09;

public class PersonTest {
    public static void main(String args[]) {
        //객체 협력
        Person personLee = new Person("lee", 1000);
        Person personKim = new Person("kim", 20000);

        String lee = personLee.takeSubway(new Subway());
        System.out.println(lee);
        //잔액이 부족합니다.

        String kim = personKim.takeTaxi(new Taxi());
        System.out.println(kim);
        //kim님은 택시를 타서 5000원을 사용했습니다.
        //남은금액 : 15000원 입니다.

    }
}
