package array;

public class ArrayTest9 {
    public static void main(String[] args) {
        //행렬 곱셈
        int[][] arrA = {{10, 2, 3, 5}, {-1, 5, 7, 2}};
        int[][] arrB = {{3, 2, 3}, {5, 1, 6}, {-9, 8, 5}, {1, 2 ,3}};
        int[][] arrR = new int[2][3];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                arrR[i][j] = 0;
                for(int p = 0; p < 4; p++) {
                    arrR[i][j] += arrA[i][p] * arrB[p][j];
                }
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arrR[i][j] + " ");
            }
            System.out.println();
        }
        /*
        18 56 72
        -39 63 68
         */
    }
}
