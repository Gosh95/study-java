package array;

public class ArrayTest4 {
    public static void main(String[] args) {
        /* 1 2 3 4 5     달팽이 모양 만들기
          16 17 18 19 6
          15 24 25 20 7
          14 23 22 21 8
          13 12 11 10 9
         */

        int[][] arr = new int[5][5];
        int row = 0;
        int column = -1;
        int number = 0;
        int s = 1; //부호 조절기
        int k = 5;

        while(true) {
            for(int p = 0; p < k; p++) {
                number += 1;
                column += s;
                arr[row][column] = number;
            }

            k -= 1;

            if(k <= 0) break;

            for(int p = 0; p < k; p++) {
                number += 1;
                row += s;
                arr[row][column] = number;
            }

            s *= -1;
        }

        for(row = 0; row < 5; row++) {
            for(column = 0; column < 5; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        /*
        1 2 3 4 5
        16 17 18 19 6
        15 24 25 20 7
        14 23 22 21 8
        13 12 11 10 9
         */

    }
}
