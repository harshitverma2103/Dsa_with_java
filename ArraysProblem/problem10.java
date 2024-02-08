package ArraysProblem;

public class problem10 {
     public static void main(String[] args) {
          int[] nums = {1, 3, 5, 7, 9};
          int target = 5;
          int result = binarySearch(nums, target);
          System.out.println("Index of target: " + result);
     }

     public static int binarySearch(int[] nums, int target) {
          int start = 0;
          int end = nums.length - 1;
          while (start <= end) {
              int mid = start + (end - start) / 2;
              if (nums[mid] == target) {
                  return mid;
              } else if (nums[mid] > target) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          }
          return -1; 
     }
}
