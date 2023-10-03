package Section2;


import java.util.Scanner;

public class MainApp03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOSE APPLICATION");
        System.out.println("1 . mynttra");
        System.out.println("2. ajio");
        int ch = sc.nextInt();
        if(ch==1)
            new Myntra().display();
        else if (ch==2)
            new Ajio().display();
        else

                    main(args);

        }


        }



