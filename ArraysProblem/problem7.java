package ArraysProblem;

public class problem7 {
     public static void main(String[] args) {
          int[] arr = { -4, 3, -9, 0, 4, 1 };
          int num = arr.length;
          plusMinus(arr, num);
     }

     public static void plusMinus(int arr[], int num) {
          int positiveNum = 0;
          int negativeNum = 0;
          int zeroNum = 0;

          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > 0) {
                    positiveNum++;
               } else if (arr[i] < 0) {
                    negativeNum++;
               } else {
                    zeroNum++;
               }
          }

          System.out.println("Percentage of positive numbers: " + ((double) positiveNum / num) * 100 + "%");
          System.out.println("Percentage of negative numbers: " + ((double) negativeNum / num) * 100 + "%");
          System.out.println("Percentage of zeros: " + ((double) zeroNum / num) * 100 + "%");
     }
}