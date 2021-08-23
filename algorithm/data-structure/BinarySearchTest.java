package structure;

public class BinarySearchTest {

    static int bSearch(int[] arr, int search) {
        int L = 0;
        int R = arr.length - 1;
        int M; //중간 값

        for(;;) {
            if(L > R) {
                return -99999;
            }

            M = (L + R) / 2;

            if(arr[M] > search) {
                R = M - 1;
                continue;
            } else if(arr[M] < search) {
                L = M + 1;
                continue;
            } else {
                return M + 1; //위치 값
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 17, 20, 22, 26, 48, 90, 95, 100, 111, 120, 130};

        System.out.println(bSearch(arr, 90)); //90

    }

}
