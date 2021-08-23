package structure;

public class QuickSortTest {
    static void qSort(int[] arr, int L, int R) {
        int temp;
        if(L >= R) return;
        int p = arr[L];
        int i = L + 1;
        int j = R - 1;

        do {
            while(p > arr[i] && i < R) i++;
            while(p < arr[i] && j > L) j--;

            if(i >= j) break;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } while(i <= j);

        temp = arr[j];
        arr[j] = arr[L];
        arr[L] = temp;

        qSort(arr, L, j-1);
        qSort(arr, j + 1, R);

    }
    public static void main(String[] args) {
        int arr[] = {26, 14, 100, 95, 22, 17, 48, 20, 50, 90};
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        qSort(arr, 0, 9);

        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}
