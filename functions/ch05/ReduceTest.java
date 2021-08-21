package ch05;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class MyCompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length > s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }

}

public class ReduceTest {

    public static void main(String[] args) {
        //reduce : 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용

        String[] foods = {"chicken", "pizza", "soup", "hamburger", "rice"};

        String lambda = Arrays.stream(foods).reduce("", (s1, s2) -> {
            if (s1.getBytes().length > s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        }).toString();

        System.out.println(lambda); //hanburger

        String binaryOperator = Arrays.stream(foods).reduce(new MyCompareString()).get();

        System.out.println(binaryOperator);
        //람다식이 너무 긴 경우 BinaryOperator를 구현한 클래스를 만들어 사용한다.
        //hamburger

    }
}
