public class Array02 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int factorCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % i == 0)
                factorCount++;
            if (factorCount == 2) {
                System.out.println("IT IS A PRIME NUMBER " + arr[i]);
            }
        }
    }
}



