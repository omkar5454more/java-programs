public class EmployeeAraay {
    String name;
    int id ;
    double salary;

    public EmployeeAraay(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display(){

        System.out.println("EMP_NAME"+name);
        System.out.println("emp_id" + id);
        System.out.println("salary"+ salary);

    }
}
