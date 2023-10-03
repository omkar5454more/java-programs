package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class program11 {
    public static void main(String[] args) {

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            list1.add(1);
            list1.add(2);
            list1.add(3);

            list2.add(4);
            list2.add(5);
            list2.add(6);

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                int product = list1.get(i) * list2.get(i);
                result.add(product);
            }
            System.out.println("Result of ArrayList multiplication:");
            for (int product : result) {
                System.out.println(product);
            }
        }
}


