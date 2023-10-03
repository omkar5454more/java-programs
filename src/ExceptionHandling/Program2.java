package ExceptionHandling;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("YOUR ARE ELIGIBLE FOR THE VOTING");
        }else{
            throw new ArithmeticException();
        }
    }
}
