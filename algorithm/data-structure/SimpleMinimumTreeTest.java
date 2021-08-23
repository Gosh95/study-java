package structure;

public class SimpleMinimumTreeTest {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 7, 12, 15, 18, 20, 9, 13, 1}; //가중치
        int[] cycle = {0, 0, 0, 0, 0, 1, 0}; //6번째 사이클 발생
        int n = 7; //정점 갯수
        int e = 11; //간선 갯수
        int temp;

        for(int i = 0; i < 11; i++) System.out.print(arr[i] + " ");
        for(int i = 0; i < e - 1; i ++) {
            for(int j = i + 1; j < e; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        for(int i = 0; i < 11; i++) System.out.print(arr[i] + " ");

        int L = 1;
        int K = 0;
        int T = 0;

        while(L <= (n - 1)) {
            if(cycle[K] == 0) {
                T += arr[K];
                L += 1;
            }
            K += 1;
        }

        System.out.println("가중치 총합 : " + T);
    }

}
