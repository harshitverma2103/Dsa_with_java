package ArraysProblem;

public class problem13 {
     public static void main(String[] args) {
          int [] array = {2,2,1};
          System.out.println(singleNumber(array));
     }
     public static int singleNumber(int[] array) {
          int XOR = 0;
          for(int e:array) {
               XOR ^= e;
          }
          return XOR;
     }
}
