package array;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*      1               마름모 모양 만들기
              3 5 7
           9 11 13 15 17
             19 21 23
                25
         */
        int[][] arr = new int[5][5];
        int num = 1;
        int mid = 2;
        int cr = mid, cl = mid;

        for(int r = 0; r < 5; r++) {
            for(int c = cr; c <= cl; c++) {
                arr[r][c] = num;
                num += 2;
            }

            if(r < mid) {
                cr--;
                cl++;
            } else {
                cr++;
                cl--;
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        0 0 1 0 0
        0 3 5 7 0
        9 11 13 15 17
        0 19 21 23 0
        0 0 25 0 0
         */

    }
}
