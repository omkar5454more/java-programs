package Looping;

public class WhilePrime {
    public static void main(String[] args) {
        int CountPrime = 0;
        int j = 1;
        while (j<=7) {
            int m = j;
            int count = 0;
            for (int i = 1; i <= m; i++) {
               if(m%i==0)
                   count++;
               if(count==2)
               {
                   System.out.println(m);
                   CountPrime++;
               }
               i++;
            }
        }
    }
}
