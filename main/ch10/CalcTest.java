package ch10;

public class CalcTest {

    public static void main(String[] args) {
        int numA = 10;
        int numB = 5;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(numA, numB)); //15
        System.out.println(calc.substract(numA, numB)); //5
        System.out.println(calc.times(numA, numB)); //50
        System.out.println(calc.divide(numA, numB)); //2

        calc.description(); //default


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int total = Calc.total(arr); //static

        System.out.println(total); //55
    }

}
