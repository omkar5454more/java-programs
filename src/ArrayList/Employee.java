package ArrayList;

import java.util.ArrayList;

public class Employee {
    int empId;
    String empName;
    int empSalary;
    String empJod;

    public Employee(int empId, String empName, int empSalary, String empJod) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empJod = empJod;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", empJod='" + empJod + '\'' +
                '}';

    }

    public static void main(String[] args) {
        ArrayList<Employee> empList1 = new ArrayList<>();
        empList1.add(new Employee(100 , "Omkar", 100000 , "DEVLOPER"));
        empList1.add(new Employee(101 , "Kiran", 50000 , "Maneger"));
        empList1.add(new Employee(102 , "Chikya", 40000 , "HR"));
        empList1.add(new Employee(103 , "Abhii", 35000 , "Conseller"));
        Employee maxSalary = empList1.get(0);
         for(Employee e: empList1){
             if(e.empSalary > maxSalary.empSalary)
             maxSalary = e ;
         }
        System.out.println(maxSalary);
    }
}
 -