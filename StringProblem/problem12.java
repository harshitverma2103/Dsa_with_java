package StringProblem;

public class problem12 {
     public static void main(String[] args) {
          String sentence = "cat and  dog";
          System.out.println(countValidWords(sentence));
     }

     public static int countValidWords(String sentence) {
          int count = 0;
          String r1 = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
          String r2 = "[^0-9]+";
          String[] arr = sentence.split("\\s+");
          for (String word : arr) {
               if (word.matches(r1) && word.matches(r2)) {
                    count++;
               }
          }
          return count;
     }
}
