package ArrayList;

import java.util.ArrayList;

public class Program8 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        int min1 = (Integer) l1.get(0);
        int min2 = (Integer ) l1.get(1);


        for(Object o : l1) {
           int o1 = (Integer) o;
           if(o1<min1){
               min2 = min1;
               min1=o1;

           }else if(o1<min2 && o1!=min1){
               min2 = o1;

           }

        }
        System.out.println(min2);
    }
}
