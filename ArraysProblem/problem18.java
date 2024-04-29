package ArraysProblem;

public class problem18 {
     @SuppressWarnings("unused")
     public static void main(String[] args) {
          int[] nums = { 3, 2, 3 };
          Integer majorityElement = findMajorityElement(nums);
          if (majorityElement != null) {
               System.out.println("Majority element: " + majorityElement);
          } else {
               System.out.println("No majority element found");
          }
     }

     public static int findMajorityElement(int[] nums) {
          Integer candidate = null;
          int count = 0;
          for (int num : nums) {
               if (count == 0) {
                    candidate = num;
                    count++;
               } else if (num == candidate) {
                    count++;
               } else {
                    count--;
               }
          }

          count = 0;
          for (int num : nums) {
               if (num == candidate) {
                    count++;
               }
          }
          if (count > nums.length / 2) {
               return candidate;
          } else {
               return -1;
          }
     }
}
