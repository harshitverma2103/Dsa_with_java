package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class problem1 {

     public static class RomanToInteger {
          public static int romanToInt(String s) {
               if (s == null || s.length() == 0)
                    return 0;

               Map<Character, Integer> map = new HashMap<>();
               map.put('I', 1);
               map.put('V', 5);
               map.put('X', 10);
               map.put('L', 50);
               map.put('C', 100);
               map.put('D', 500);
               map.put('M', 1000);

               int result = 0;
               int prevValue = 0;

               for (int i = s.length() - 1; i >= 0; i--) {
                    int curValue = map.get(s.charAt(i));
                    if (curValue < prevValue) {
                         result -= curValue;
                    } else {
                         result += curValue;
                    }
                    prevValue = curValue;
               }
               return result;
          }

          public static void main(String[] args) {
               String s = "III";
               System.out.println(romanToInt(s));
          }
     }
}
