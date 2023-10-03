package Method;

import java.util.Scanner;

public class Method07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS!!");
        int marks = sc.nextInt();
        gradecalculator(marks);
    }
    public static void gradecalculator(int marks){
        if(  marks >= 91 && marks<=100){
            System.out.println("GRADE : AA");
        }else if(marks >=81 && marks<=90){
            System.out.println(" GRADE :BB");
        }else if(marks >=71 && marks<=80) {
            System.out.println(" GRADE :CC");
        }else if(marks >=61 && marks<=70) {
            System.out.println("GRADE : DD");
        }else if(marks >=51 && marks<=60) {
            System.out.println(" GRADE :EE");
        }else if(marks >=41 && marks<=50) {
            System.out.println(" GRADE :FF");
        }else if(marks >=0 && marks<=40) {
            System.out.println("FAIL");
        }
    }
}
