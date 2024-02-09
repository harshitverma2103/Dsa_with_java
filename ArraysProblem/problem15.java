package ArraysProblem;

import java.util.Arrays;

public class problem15 {
     public static void main(String[] args) {
          int[] arr1 = { 1, 2, 3, 0, 0, 0 };
          int target1 = 3;
          int[] arr2 = { 2, 5, 6 };
          int target2 = 3;
          System.out.println(Arrays.toString(merge(arr1, target1, arr2, target2)));
     }

     public static int[] merge(int[] arr1, int target1, int[] arr2, int target2) {
          for (int j = 0, i = target1; j < target2; j++) {
               arr1[i] = arr2[j];
               i++;
          }
          Arrays.sort(arr1);
          return arr1;
     }
}
