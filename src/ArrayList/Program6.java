package ArrayList;

import java.util.ArrayList;

public class Program6 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        ArrayList l2 = new ArrayList();
        l2.add(10);
        l2.add(60);
        l2.add(80);
        l2.add(20);
        l2.add(50);
       ArrayList l3= new ArrayList() ;
       for(int i =0; i<l1.size(); i++){
           if(l2.contains(l1.get(i)));
           l3.add(l1.get(i));
       }
        System.out.println(l3);

    }
}
