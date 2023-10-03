package Array;

public class Twosum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
       for(int j =0 ; j<nums.length; j++) {

        for(int i=0; i< nums.length;i++) {

            int a = nums[j] + nums[i];
            if (a == target) {
                System.out.println(i);
                System.out.println(j);
                System.out.println("------------------------");
            }else {
               // System.out.println("INVALID ELMENT");
            }
        }
        }


   }
}
