package Method;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1");
        int num1 = sc.nextInt();
        System.out.println("ENTER NUMBER 2");
        int num2 = sc.nextInt();
        add(num1,num2);

    }
    public static void add(int a, int b){

        int sum = a+b;
        int product = a*b;
        System.out.println("THE SUM OF A AND B IS :"+sum);
        System.out.println("THE PRODUCT OF TWO NUMBR IS : "+ product);
    }
}
