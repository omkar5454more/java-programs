public class Employee extends Salary{
    int bonus = 1000;
    public  static void main(String[] args){
        Employee e1 = new Employee();
         System.out.println("Salary is "+ e1.salary);
         System.out.println("bonus is"+ e1.bonus);

    }
}
