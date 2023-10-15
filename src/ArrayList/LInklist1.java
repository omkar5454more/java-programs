package ArrayList;

import java.util.LinkedList;

public class LInklist1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(2,900);
        l1.set(3,400);

        System.out.println(l1);
    }
}
