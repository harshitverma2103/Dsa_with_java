package StringProblem;

public class problem13 {
     public static void main(String[] args) {
          String num1 = "11";
          String num2 = "123";
          System.out.println(addStrings(num1, num2));    
     }

     public static String  addStrings(String num1 , String num2){
          int result = 0;
          int integerValue1 = Integer.parseInt(num1);
          int integerValue2 = Integer.parseInt(num2);
          result = integerValue1 + integerValue2;
          String finalResult = String.valueOf(result);
          return finalResult;
     }
}
