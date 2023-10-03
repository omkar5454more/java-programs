package Section2;

public class Employee extends Member {
    String speciallization;

    public Employee(String name, int age, int phoneNumber, String address, Double salary, String speciallization) {
        super(name, age, phoneNumber, address, salary);
        this.speciallization = speciallization;
    }
    @Override
    public void printsalary() {
        super.printsalary();
    }


}
