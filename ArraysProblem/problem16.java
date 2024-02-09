package ArraysProblem;

public class problem16 {
     public static void main(String[] args) {
          int[] arr = {0,1,11,55,99};
          maxAndMinNum(arr);
     }
     public static void maxAndMinNum(int[] arr ) {
          int minNum = arr[0];
          int maxNum = arr[0];
          for(int i = 1; i < arr.length; i++){ 
               if(maxNum < arr[i]) {
                    maxNum = arr[i]; 
               } 
               if (minNum > arr[i]) {
                    minNum = arr[i];
               }
          }
          System.out.println("Maximum number: " + maxNum);
          System.out.println("Minimum number: " + minNum);
     }
}
