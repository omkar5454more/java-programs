package Method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FRIST NUMBER");
        int num1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER ");
        int num2 = sc.nextInt();
        System.out.println("ENTER THIRD NUMBER  ");
        int num3 = sc.nextInt();

        Max( num1,  num2,num3);
        Min(num1,num2,num3);
    }


        public static void Max(int a,int b,int c) {

            int max = a;

            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }

            System.out.println("THE MAXIMUM NUMBER IS :" + max);



        }
        public static void Min(int a,int b , int c){

        int min=a;

            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }

            System.out.println("THE MINIMUM NUMBER IS: " + min);
        }

    }

