package ch01;

public class MyArrayTest {

    public static void main(String[] args) {
        MyArrayList myArr = new MyArrayList();
        myArr.add(0);
        myArr.add(3);
        myArr.add(2);
        myArr.add(9);
        myArr.add(7);
        myArr.add(6);
        myArr.add(8);
        myArr.add(5);
        myArr.add(4);
        myArr.add(1);

        myArr.showList(); //0 -> 3 -> 2 -> 9 -> 7 -> 6 -> 8 -> 5 -> 4 -> 1	-END

        System.out.println(myArr.get(0)); //0

        myArr.remove(0);
        myArr.showList(); //3 -> 2 -> 9 -> 7 -> 6 -> 8 -> 5 -> 4 -> 1	-END

        myArr.insert(0, 0);
        myArr.showList(); //0 -> 3 -> 2 -> 9 -> 7 -> 6 -> 8 -> 5 -> 4 -> 1	-END

        myArr.sort();
        myArr.showList(); //0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9	-END


    }

}
