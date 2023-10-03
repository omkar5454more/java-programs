import java.util.Scanner;

public class ArrayExample03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10] ;
        System.out.println("ENTER VALUES IN THE ARRAY");
         for(int i = 0 ; i<10 ; i++){
             arr[i] = sc.nextInt();
         }
        System.out.println("ENTER NUMBER TO SEARCH IN THE ARRAY");
         int searchNumber = sc.nextInt();

         boolean found = false;

        for(int a : arr) {
            if (a == searchNumber) {
                found = true;

            }
        }
        if(found)
        {
            System.out.println("VALUE IS PRESENT AND THAT IS :"+ searchNumber);

        } else {
            System.out.println(" value is not present " + searchNumber);
        }

    }
}
