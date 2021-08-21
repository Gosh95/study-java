package array;

public class ArrayTest {
    public static void main(String[] args) {
        /*  1 6 11 16 21    모양을 만들어라.
            2 7 12 17 22
            3 8 13 18 23
            4 9 14 19 24
            5 10 15 20 25
         */

        int[][] arr = new int[5][5];
        int column = 0;
        int row = 0;
        int number = 0;

        do {
            do {
                number++;
                arr[row][column] = number;
                row++;
            } while(row <= 4);
            column++;
            row = 0;
        } while(column <= 4);

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        1 6 11 16 21
        2 7 12 17 22
        3 8 13 18 23
        4 9 14 19 24
        5 10 15 20 25
        */
    }
}
