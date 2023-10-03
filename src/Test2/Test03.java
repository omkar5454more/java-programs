package Test2;
import java.util.Scanner;
public class Test03 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("ENTERED CHARACTER IS IN LOWERCASE");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("ENTERED CHARACTER IS IN UPPERCASE");
            } else {
                System.out.println("Entered character is not a letter.");
            }


        }
    }


