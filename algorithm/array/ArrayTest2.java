package array;

public class ArrayTest2 {
    public static void main(String[] args) {
        /* 1  2  3  4  5    삼각형 모양으 만들어라
              6  7  8  9
                 10 11 12
                    13 14
                       15
         */
        int[][] arr = new int[5][5];
        int row = 0;
        int column = 0;
        int number = 1;

        do {
            column = row;

            do {
                arr[row][column] = number;
                number++;
                column++;
            } while(column <= 4);

            row++;
        } while(row <= 4);

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        1 2 3 4 5
        0 6 7 8 9
        0 0 10 11 12
        0 0 0 13 14
        0 0 0 0 15
         */

    }
}
