package ch04;

public class StringConcatClass implements StringConcat {

    @Override
    public void makeString(String s, String v) {
        System.out.println(s + ", " + v);
    }

}
