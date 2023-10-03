import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("ENTER NUMBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();




        if(n%2==0){

            for(int i=0 ; i<=n ; i++){

                sum += i;
            }
            System.out.println("SUM OF EVEN NO. :"+sum);
        }
        else {

            for(int i=0 ; i<=n ; i++){
                sum+=i;
            }
            System.out.println("SUM OF ODD NO. :"+sum);
        }
    }
}
