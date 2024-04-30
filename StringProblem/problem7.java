package StringProblem;

public class problem7 {
     public static void main(String[] args) {
          String num = "42";
          System.out.println(oddNumber(num));
     }

     public static String oddNumber(String num) {
          String result = "";

          for (int i = 0; i < num.length(); i++) {
               int intValue = Integer.parseInt(num);
               if (intValue % 2 != 0) {
                    String str = String.valueOf(intValue);
                    result += str + " , the number is already a odd number";
                    break;
               }
               char character = num.charAt(i);
               int numericValue = (int) character;
               if (numericValue % 2 != 0) {
                    char oddChar = (char) numericValue;
                    result += oddChar;
               }
          }
          if (result.equals("")) {
               return "";
          }
          return result;
     }
}
