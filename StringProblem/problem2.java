package StringProblem;

public class problem2 {
     public static void main(String[] args) {
          String s = "bab";
          System.out.println(validPalindrome(s));
     }
     public static boolean validPalindrome(String s){
          String reverseStr = "";
          for(int i = s.length() - 1; i >= 0; i--){
               reverseStr += s.charAt(i);
          }

          if(reverseStr.equals(s)) {
               return true;
          } else {
               return false;
          }
     }
}
