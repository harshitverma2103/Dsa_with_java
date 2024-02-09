package ArraysProblem;

import java.util.Arrays;

public class problem14 {
     public static void main(String[] args) {
          int[] array = {3,2,3};
          System.out.println(majorityElement(array));
     }
     public static int majorityElement(int[] array){
          Arrays.sort(array);
          int n = array.length;
          return array[n/2];
     }
}
