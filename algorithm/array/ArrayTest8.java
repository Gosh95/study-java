package array;

public class ArrayTest8 {
    public static void main(String[] args) {
        //배열 회전 시키기
        char[][] arrA = {{'A','B','C','D','E'}, {'F','G','H','I','J'}, {'K','L','M','N','O'}, {'P','Q','R','S','T'}, {'U','V','W','X','Y'}};
        char[][] arrB = new char[5][5];
        for(int r = 0; r < 5; r++) {
            for(int c = 0; c < 5; c++) {
                int n = 4 - r;
                arrB[c][n] = arrA[r][c];
            }
        }

        System.out.println("arrA");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        System.out.println("arrB");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arrB[i][j] + " ");
            }
            System.out.println();
        }
    }


}
