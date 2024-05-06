package StringProblem;

public class problem15 {
     public static void main(String[] args) {
          String s = "III";
          System.out.println(romanToInt(s));

          s = "LVIII";
          System.out.println(romanToInt(s));
          
          s = "MCMXCIV";
          System.out.println(romanToInt(s));
     }

     public static int romanToInt(String s) {
          int result = 0;
          for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               if (ch == 'I') {
                    if (i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                         result -= 1;
                    } else {
                         result += 1;
                    }
               } else if (ch == 'V') {
                    result += 5;
               } else if (ch == 'X') {
                    if (i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                         result -= 10;
                    } else {
                         result += 10;
                    }
               } else if (ch == 'L') {
                    result += 50;
               } else if (ch == 'C') {
                    if (i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                         result -= 100;
                    } else {
                         result += 100;
                    }
               } else if (ch == 'D') {
                    result += 500;
               } else {
                    result += 1000;
               }
          }
          return result;
     }
}
