package ObjectCompostion;

public class Mobile {
    Charger c1 = new Charger();
    Memory s1 = new Memory();

    public void on(){
        System.out.println("MOBILE IS ON");
    }
}
