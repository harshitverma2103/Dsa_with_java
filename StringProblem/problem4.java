package StringProblem;

public class problem4 {

     public static void main(String[] args) {
          String s = "()[]{}";
          System.out.println(isValid(s));
     }

     public static boolean isValid(String s) {
          if (s.length() % 2 != 0)
               return false;

          for (int i = 0; i < s.length() - 1; i++) {
               char c1 = s.charAt(i);
               char c2 = s.charAt(i + 1);

               if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    i = -1;
               }
          }

          return s.isEmpty();
     }
}
