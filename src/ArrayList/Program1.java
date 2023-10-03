//PROGRAM TO INCREASE THE CAPACITY OF THE ARRAYLIST
package ArrayList;

import java.util.ArrayList;

public class Program1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        //NOW LIST CAN HOLD 10 ELEMNT ( DEFAULT INITIAL CAPACITY)
        list1.ensureCapacity(20);
        //NOW LIST CAN HOLD 20 ELEMENT
    }
}
