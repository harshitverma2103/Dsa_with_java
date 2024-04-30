package StringProblem;

public class problem6 {
     public static void main(String[] args) {
          String str = "hello";
          System.out.println(scoreOfString(str));
     }

     public static int scoreOfString(String str) {
          int score = 0;
          for (int i = 0; i < str.length() - 1; i++) {
               int score1 = (int) str.charAt(i);
               int score2 = (int) str.charAt(i+1);
               score += Math.abs(score1-score2);
          }
          return score;          
     }
}
