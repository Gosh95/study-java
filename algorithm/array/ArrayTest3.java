package array;

public class ArrayTest3 {
    public static void main(String[] args) {
        /* 1 2 3 4 5            배열을 모래시계 모양으로 만들어라
             6 7 8
               9
           10 11 12
         13 14 15 16 17
         */
        int[][] arr = new int[5][5];
        int number = 1;
        int mid = 3;

        for(int r = 0; r < mid; r++) {
            for(int c = r; c < (5 - r); c++) {
                arr[r][c] = number;
                number++;
            }
        }

        for(int r = mid; r < 5; r++) {
            for(int c = (4 - r); c <= r; c++) {
                arr[r][c] = number;
                number++;
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        1 2 3 4 5
        0 6 7 8 0
        0 0 9 0 0
        0 10 11 12 0
        13 14 15 16 17
         */
    }
}
