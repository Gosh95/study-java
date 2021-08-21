package array;

public class ArrayTest7 {
    public static void main(String[] args) {
        //마방진을 만들어라. (한 라인의 합이 모두 같은 배열)
        int[][] arr = new int[5][5];
        int row = 0;
        int col = 0;

        for(int n = 1; n <= 25; n++) {
            arr[row][col] = n;

            int mRow = row - 1; //마방진 행
            int mCol = col + 1; //마방진 열

            if(mRow == -1) mRow = 4;
            if(mCol == 5) mCol = 0;

            if(arr[mRow][mCol] == 0) {
                row = mRow;
                col = mCol;
            } else {
                row++;
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        1 8 15 17 24
        7 14 16 23 5
        13 20 22 4 6
        19 21 3 10 12
        25 2 9 11 18
         */
    }
}
