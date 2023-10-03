package Section2;

public class Member {
    String name ;
    int age  ;
    int phoneNumber ;
    String address ;
   Double salary ;

    public Member(String name, int age, int phoneNumber, String address, Double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printsalary(){
        System.out.println("NAME "+         name );
        System.out.println("AGE"+           age);
        System.out.println("PHONENUMBER"+   phoneNumber);
        System.out.println("ADDRESS"+        address);
        System.out.println("salary"+         salary);
    }
}
