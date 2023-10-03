import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE");
        int age = sc.nextInt();
        Eligibility(age);
    }
    public static void Eligibility(int age){
        if(age >= 18){
            System.out.println("YOUR ARE ELIGIBLE");
        }else{
            System.out.println("you are not eligible");
        }
    }
}
