//PROGRAM TO DECREASE THE CAPACITY OF THE ARRAYLIST
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.ensureCapacity(20);//INCREASE THE CAPACITY OF THE ARRAYLIST TP 20
        list1.trimToSize();//DECREASE THE CAPACITY OF THE ARRAYLIST TOL ORIGINAL
        System.out.println("SIZE OF ARRAYLIST   "+ list1.size());//CURRENT SIZE OF THE ARRAYLIST
        System.out.println(list1.isEmpty());//METHOD TO DISPLAY THE CURRENT ARRAYLIST IS EMPTY OR NOT
        System.out.println(list1.contains(2));//METHOD TO DISPLAY THE GIVEN ELEMENT IS PRASENT OR NOT
        System.out.println(list1.indexOf(3));//METHOD TO DISPLAY THE INDEX OF THE ELEMENT
       // list1.clear();//METHOD TO CLEAR ALL THE ELEMENT FROM THE LIST
        List<Integer> sublist = list1.subList(0 , 1);//retrive THE PERTICULAR ELEMENT from the list
        System.out.println(sublist);
        //FOR ADDING TO LIST (listname.addAll())
    }
}
