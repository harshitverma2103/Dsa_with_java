package ArraysProblem;

public class problem12 {
     public static void main(String[] args) {
          int[] array = { 0, 1, 0, 3, 12 };
          System.out.println("Array before moving zeros:");
          printArray(array);
          moveZero(array);
          System.out.println("Array after moving zeros:");
          printArray(array);
     }

     public static void moveZero(int[] array) {
          int k = 0;
          for (int i = 0; i < array.length; i++) {
               if (array[i] != 0) {
                    array[k] = array[i];
                    k++;
               }
          }
          for (int i = k; i < array.length; i++) {
               array[i] = 0;
          }
     }

     public static void printArray(int[] array) {
          for (int num : array) {
               System.out.print(num + " ");
          }
          System.out.println();
     }
}
