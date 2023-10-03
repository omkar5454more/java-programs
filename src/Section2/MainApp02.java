package Section2;

public class MainApp02 {
    public static void main(String[] args) {
        Ice i1 = new Ice();
        System.out.println(i1.formula);
        i1.stateofWater();

        GAS g1 = new GAS();
        g1.stateofWater();
    }
}
