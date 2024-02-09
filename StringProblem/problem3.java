package StringProblem;

public class problem3 {
     public static void main(String[] args) {
          System.out.println(countKeyChanges("aAbBcC"));
     }
     public static int countKeyChanges(String str ){
          str = str.toLowerCase();
          int count = 0;
          for(int i = 0; i < str.length()-1; i++){
               if(str.charAt(i) != str.charAt(i+1)){
                    count++;
               }
          }
          return count;
     }
}
