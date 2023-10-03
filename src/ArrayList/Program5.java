package ArrayList;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++)
        System.out.println("ENTER THE VALUE");
        ArrayList list1 = new ArrayList();
        int a = sc.nextInt();
        if(!list1.contains(a))
            list1.add(a);


    }

}
