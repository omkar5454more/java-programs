import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TOTAL EMPLOYEE");
        int size = sc.nextInt();
        EmployeeAraay[] e1 = new EmployeeAraay[size];
        for(int i = 0 ; i<size ; i++){
            System.out.println("ENTER THE NAME ");
            String name = sc.next();
            System.out.println("ENTER ID ");
            int id = sc.nextInt();
            System.out.println("ENTER SALARY");
            double salary = sc.nextInt();
            e1[i] = new EmployeeAraay(name , id , salary );
            for (EmployeeAraay a: e1 ){
                System.out.println();
                a.display();
            }

        }


    }
}
