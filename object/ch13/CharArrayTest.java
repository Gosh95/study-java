package ch13;

public class CharArrayTest {

    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = ch++;

            System.out.print(alphabet[i] + " ");//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }

        System.out.println();

        for (char a : alphabet) {
            System.out.print((int) a + " ");
            //65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90
        }
    }

}
