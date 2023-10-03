public class table {
    public static void printMultiplicationTable(int number, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            printMultiplicationTable(number, multiplier + 1);
        }
    }

    public static void main(String[] args) {
        int tableNumber = 15;
        printMultiplicationTable(tableNumber, 1);
    }
}


