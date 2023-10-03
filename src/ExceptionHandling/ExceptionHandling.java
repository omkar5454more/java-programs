package ExceptionHandling;

import java.sql.SQLOutput;

public class ExceptionHandling {
    public  static void Demo(){
        System.out.println("DEMO METHOD START");
        System.out.println(10/0);
        System.out.println("DEMO METHOD END");
    }
    public static void Central(){
        System.out.println("CENTRAL METHOD START ");
        Demo();
        System.out.println("CENTRAL METHOD END");
    }

    public static void main(String[] args) {
        System.out.println("MAIN METHOD START ");
        try{
            Central();
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("MAIN METHOD END");
    }
}
