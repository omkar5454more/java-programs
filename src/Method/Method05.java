package Method;

import java.util.Scanner;

public class Method05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS OF CIRCLE");
        int rad = sc.nextInt();
        Circum(rad);
        area(rad);
    }
    public static void Circum(int rad){

        double Circumference  = 2*3.14*rad;
        System.out.println("CIRCUMFERENCE :" + Circumference);

    }
    public static void area(int rad) {
        double area1 = 3.14*rad*rad;
        System.out.println("AREA OF THE CIRCLE IS "+ area1);
        }
    }

