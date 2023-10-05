package ArrayList;
import java.util.Scanner;
public class MainApp1 {
    static Scanner sc = new Scanner(System.in);
    static StudentManagement studentManagement = new StudentManagement();

    public static void main(String[] args) {

        System.out.println("SELECT AN OPTION ");
        System.out.println("1. ADD STUDENT");
        System.out.println("2.REMOVE STUDENT");
        System.out.println("3.DISPLAY STUDENT");
        System.out.println("4. SEARCH STUDENT");
        System.out.println("5. FAIL STUDENT");
        System.out.println("6. TOPPER STUDENT");
        int ch = sc.nextInt();


        switch (ch) {

            case 1:
                addStudent();
                break;
            case 2:
                removeStudent();
                break;
            case 3:
                displayStudent();
                break;
            case 4:
                searchStudent();
                break;
            case 5:
                failedStudent();
                break;
            case 6:
                topperStudent();
                break;

        }
        main(args);
    }
    public static void addStudent() {
        System.out.println("ENTER STUDENT ID");
        int id = sc.nextInt();
        System.out.println("ENTER STUDENT NAME ");
        String name = sc.next();
        System.out.println("ENTER STUDENT MARKS");
        double marks = sc.nextDouble();
        Student stu = new Student(id,name,marks);
        studentManagement.addStudent(stu);
    }
    public static void removeStudent(){
        System.out.println("ENTER STUDENT ID");
        int id = sc.nextInt();
        studentManagement.removeStudent(id);
    }
    public static void displayStudent(){


       // System.out.println();
        studentManagement.displayStudent();
    }
    public static void searchStudent(){
        System.out.println("ENTER STUDENT NAME");
        String name = sc.next();
        studentManagement.searchStudent(name);
    }
    public static void failedStudent() {

        studentManagement.failedStudent();
    }
    public static void topperStudent() {
        studentManagement.topperStudent();
    }
}

