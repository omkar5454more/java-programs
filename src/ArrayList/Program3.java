package ArrayList;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
            ArrayList list = new ArrayList();
            list.add(arr[i]);
            System.out.println(list);
        }


    }
}
