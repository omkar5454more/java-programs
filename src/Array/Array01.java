package Array;

public class Array01 {
    public static void main(String[] args) {
        double [] arr = { 20.43 , 10.21, 40.10, 10.11, 11.15};
         double sum = 0;
         for( int i = 0 ; i<arr.length  ; i++)
              sum+=arr[i];
              System.out.println("SUM" + sum);
    }
}
