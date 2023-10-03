package Test2;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS!!");
        int marks = sc.nextInt();
        gradecalculator(marks);
    }
    public static void gradecalculator(int marks){
        if(  marks >= 81 ){
            System.out.println("GRADE : AA");
        }
        else if(marks >=61 && marks<=80) {
            System.out.println(" GRADE :BB");
        }else if(marks >=61 && marks<=70) {
            System.out.println("GRADE : CC");
        }else if(marks >=45 && marks<=60) {
            System.out.println(" GRADE :DD");
        }else if(marks >=26 && marks<=44) {
            System.out.println(" GRADE :EE");
        }else if(marks <=25) {
            System.out.println("FAIL");
        }
    }
}
