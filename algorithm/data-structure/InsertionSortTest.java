package structure;

public class InsertionSortTest {
    public static void main(String[] args) {
        //선택 정렬
        int[] score = {95, 75, 85, 100, 50};
        int i, j, key;

        for(i = 1; i < 5; i++) {
            key = score[i];

            for(j = i - 1; j >= 0; j--) {
                if(score[j] < key) break;
                score[j+1] = score[j];
            }
            score[j+1] = key;
        }

        System.out.println();
        for(int p = 0; p < 5; p++) {
            System.out.print(score[p] + " ");
        }
    }
}
