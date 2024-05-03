package ArraysProblem;

class problem19 {
     public static void main(String[] args) {
          int[] array = {-1, -10, 3, 99, 0, 1, 2, 5};
          System.out.println(positiveSmallestNumber(array));
     }

     public static int positiveSmallestNumber(int[] array){
          int smallestPositive = Integer.MAX_VALUE;
          for(int num : array){
               if(num > 0 && num < smallestPositive){
                    smallestPositive = num;
               }
          }
          if (smallestPositive == Integer.MAX_VALUE) {
               return -1;
          }
          return smallestPositive;
     }
}
