package StringProblem;

public class problem11 {
     public static void main(String[] args) {
          String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
          System.out.println("Maximum number of words in a single sentence: " + mostWordsFound(s));
     }

     public static int mostWordsFound(String[] s) {
          int maxWords = 0;
          for(String sentence : s){
               String[] words = sentence.split("\\s+");
               int wordCount = words.length;
               if(wordCount > maxWords){
                    maxWords = wordCount;
               }
          }
          return maxWords;
     }
}
