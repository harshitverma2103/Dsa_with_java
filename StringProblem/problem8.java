package StringProblem;

import java.util.Arrays;

public class problem8 {
     public static void main(String[] args) {
          String[] str = { "h", "e", "l", "l", "o" };
          reverseString(str);
          System.out.println(Arrays.toString(str));
     }

     public static void reverseString(String[] str) {
          int start = 0;
          int end = str.length - 1;

          while (start < end) {
               String temp = str[start];
               str[start] = str[end];
               str[end] = temp;

               start++;
               end--;
          }
     }
}
