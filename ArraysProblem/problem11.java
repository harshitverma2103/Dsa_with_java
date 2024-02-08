package ArraysProblem;

import java.util.Arrays;

public class problem11 {
     public static void main(String[] args) {
          int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 , 8};
          missingNumber(nums);
     }

     public static void missingNumber(int[] nums) {
          int num = 0;
          Arrays.sort(nums);
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] == num) {
                    num++;
               } else {
                    System.out.println("the missing num = " + num);
               }
          }
          System.out.println(" no missing num found ");

     }
}
