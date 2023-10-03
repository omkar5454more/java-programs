public class Array2DExample {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {30, 40, 50},
                {60, 70, 80}
        };

        //int maxNum = arr[0][0];
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                maxSum += arr[i][j];

                // if (arr[i][j] < maxSum)
                // System.out.println(maxSum);

                // if(arr[i][j]>maxNum){
                //maxSum=arr[i][j];


            }
            System.out.println(maxSum);
        }
       // System.out.println(maxSum);


    }
}




