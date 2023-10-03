package Section2;

public class Mainapp4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("arjun", 21 , 1234 , "LATUR", 10000.0 , "BACKENDDEVLOPER");
        emp1.printsalary();
        System.out.println("------------------------");
        Manager mgr1 = new Manager("OMKAR",21,22233,"PUNE", 900000.0, "DEVLOPMENT");
        mgr1.printsalary();
    }
}
