package StringProblem;

public class problem5 {
     public static void main(String[] args) {
          String str = "codeleet";
          int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
          String output = restoreString(str, indices);
          System.out.println(output);
     }

     public static String restoreString(String str, int[] indices) {
          char[] result = new char[str.length()];
          for (int i = 0; i < str.length(); i++) {
               result[indices[i]] = str.charAt(i);
          }
          return new String(result);
     }
}
