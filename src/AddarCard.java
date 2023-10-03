import java.sql.SQLOutput;
import java.util.Random;
public class AddarCard {
    private int adharNo;
    private String  name;

    private  String Address;

    public AddarCard(int adharNo, String name, String address) {
        this.adharNo = new Random().nextInt(100000);
        this.name = name;
        Address = address;
    }
    public void display(){
        System.out.println("---------------------");
        System.out.println("ADHAR NO "+ adharNo);
        System.out.println("NAME"+  name );
        System.out.println("Adrees "+ Address);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAdharNo() {
        return adharNo;
    }
}



