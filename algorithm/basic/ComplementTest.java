public class ComplementTest {
    public static void main(String[] args) {
      int[] binary = {1, 0, 1, 0, 1}; //2진수 10101
      int[] one = new int[5];
      int[] two = new int[5];
      int i = 0;

      do {
          one[i] = 1 - binary[i];
          i++;
      } while(i < 5);

      i = binary.length - 1;
      int carry = 1;

      do {
          two[i] = 1;

          if(one[i] == carry) {
              two[i] = 0;
          }

          carry *= one[i]; //carry가 1의 보수 둘다 1일 때 1 다를 때 0
          i--;
      } while(i >= 0);

      for(int j = 0; j < 5; j++) {
          System.out.print(one[j]); //1의 보수 01010
      }

      System.out.println();

      for(int j = 0; j < 5; j++) {
        System.out.print(two[j]); //2의 보 01010
      }
    }
}
