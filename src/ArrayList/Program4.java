package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list1 = new ArrayList();
        for(int i =0; i<5 ; i++){
            System.out.println("ENTER THE VALUE");
            int a = sc.nextInt();
            System.out.println(list1.contains(a));
            if(!list1.contains(a))
                list1.add(a);
        }



    }
}
