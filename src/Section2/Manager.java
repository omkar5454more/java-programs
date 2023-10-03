package Section2;

public class Manager extends Member{
    String department;

    public Manager(String name, int age, int phoneNumber, String address, Double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    public void printsalary() {
        super.printsalary();
    }
}
