package array;

public class ArrayTest6 {
    public static void main(String[] args) {
        /* ㄹ 모양 만들기
        1 2 3 4 5
        10 9 8 7 6
        11 12 13 14 15
        20 19 18 17 16
        21 22 23 24 25
         */
        int[][] arr = new int[5][5];
        int num = 1;
        int c1 = 0, c2 = 4;
        int d = 1;

        for(int r = 0; r < 5; r++) {
            for(int c = c1; c != c2 + d; c += d) {
                arr[r][c] = num;
                num++;
            }

            int temp = c1;
            c1 = c2;
            c2 = temp;
            d = -d;
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
