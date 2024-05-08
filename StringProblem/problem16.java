package StringProblem;

public class problem16 {
     public static void main(String[] args) {
          String str1 = "sadbutsad";
          String str2 = "sad";
          System.out.println(findingElementThatOccurrenceInAString(str1, str2));
     }

     public static int findingElementThatOccurrenceInAString(String str1, String str2) {
          int str1Length = str1.length();
          int str2Length = str2.length();
          if (str1.isEmpty()) {
               return 0;
          }
          for (int i = 0; i <= str1Length - str2Length; i++) {
               for (int j = 0; j < str2Length; j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                         break;
                    }
                    if (j == str2Length - 1) {
                         return i;
                    }
               }
          }
          return -1;
     }
}
