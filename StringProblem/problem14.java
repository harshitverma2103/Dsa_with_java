package StringProblem;

import java.util.ArrayList;
import java.util.List;

public class problem14 {
     public static void main(String[] args) {
          int n1 = 3;
          List<String> result1 = fizzBuzz(n1);
          System.out.println("Output: " + result1);
     }

     public static List<String> fizzBuzz(int n) {
          List<String> answer = new ArrayList<>();
          for (int i = 1; i <= n; i++) {
               if (i % 15 == 0) {
                    answer.add("FizzBuzz");
               } else if (i % 3 == 0) {
                    answer.add("Fizz");
               } else if (i % 5 == 0) {
                    answer.add("Buzz");
               } else {
                    answer.add(String.valueOf(i));
               }
          }
          return answer;
     }
}
