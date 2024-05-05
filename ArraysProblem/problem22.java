package ArraysProblem;

public class problem22 {
     public static void main(String[] args) {
          int[] array = { 3, 2, 3, 2 };
          int value = 3;
          System.out.println(removeElement(array, value));
     }

     public static int removeElement(int[] array, int value) {
          int i = 0;
          for (int num : array) {
               if (num != value) {
                    array[i] = num;
                    i++;
               }
          }
          return i;
     }
}
