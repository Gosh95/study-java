package structure;

import org.w3c.dom.ls.LSOutput;

public class BubbleSortTest {
    public static void main(String[] args) {
        //버블 정렬을 적용하여 오름차순을 출력해라.
        int[] score = {95, 75, 85, 100, 50};
        int i = 0;
        int temp;

        do {
            int j = 0;

            do {
                if(score[j] > score[j+1]) {
                    temp = score[j+1];
                    score[j+1] = score[j];
                    score[j] = temp;
                }

                j++;
            } while(j < 4 - i);

            i++;
        } while(i < 4);

        for(int p = 0; p < 5; p++) {
            System.out.print(score[p] + " ");
        }
        //50 75 85 95 100
    }


}
