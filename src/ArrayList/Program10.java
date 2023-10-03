package ArrayList;

import java.util.ArrayList;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("core java");
        list1.add("sql");
        list1.add("web tech");
        list1.add("automation");
        list1.add("python");

        String size = (String)list1.get(0);

        for (String s: list1)

            if(s.length()<size.length()){
                size = s;


        }
        System.out.println(size);



    }
}
