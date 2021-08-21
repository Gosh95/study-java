package ch11;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }

}


public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("CCC");
        treeSet.add("BBB");
        treeSet.add("AAA");

        System.out.println(treeSet.toString());
        System.out.println();
        //String 클래스는 이미 Comparable 인터페이스가 오름차순으로 구현되어 있다.
        //[AAA, BBB, CCC]

        TreeSet<String> treeSet2 = new TreeSet<>(new MyCompare());
        treeSet2.add("CCC");
        treeSet2.add("BBB");
        treeSet2.add("AAA");

        System.out.println(treeSet2.toString());
        System.out.println();
        //String 클래스는 이미 Comparable 인터페이스가 오름차순으로 구현되어 있기 때문에
        //바꾸고 싶을 때는 Comparator를 implements 해서 다시 정의해 준다.
        //[CCC, BBB, AAA]

        UserTreeSet userSet = new UserTreeSet();

        User kim = new User(100, "kim");
        User lee = new User(101, "lee");
        User jun = new User(102, "jun");
        User ko = new User(103, "ko");
        User jin = new User(104, "jin");

        userSet.add(kim);
        userSet.add(lee);
        userSet.add(jun);
        userSet.add(ko);
        userSet.add(jin);

        userSet.showAllUser();
		/*
		 * Comparable 을 implements 해줘서 Number로 오름차순 정렬
			kim님의 유저넘버는 100입니다.
			lee님의 유저넘버는 101입니다.
			jun님의 유저넘버는 102입니다.
			ko님의 유저넘버는 103입니다.
			jin님의 유저넘버는 104입니다.
		 */
    }
}
