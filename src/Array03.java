import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int [5];
        System.out.println("ENTER THE VALUES IN THE ARRAY");
        int n = scanner.nextInt();

        for (int i = 0; i < 5; i++) {

          arr[i]=n;
        }
        if( n%2==0)
            System.out.println("number is even");
         else
             System.out.println("NUMBER IS ODD");


    }
}

