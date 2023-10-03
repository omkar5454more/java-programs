import java.util.Scanner;

public class ArrayExample04 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("ENTER VALUES IN THE ARRAY");
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    System.out.println("THE NUMBER IS NEGATIVE " +        arr[i]);
                } else {
                    System.out.println("THE NUMBER IS POSITIVE " +        arr[i]);
                }

            }
            for (int a : arr) {
                if (a % 2 == 0) {
                    System.out.println("THE NUMBER IS EVEN    " +     a);

                } else {
                    System.out.println("THE NUMBER IS ODD  " +       a);
                }
            }
        }
}
