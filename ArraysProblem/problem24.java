package ArraysProblem;

public class problem24 {
     public static void main(String[] args) {
          int x = -123;
          System.out.println(reverse(x));
     }

     public static int reverse(int x) {
          int reversed = 0;
          while (x != 0) {
               int digit = x % 10;
               int newReversed = reversed * 10 + digit;
               if ((newReversed - digit) / 10 != reversed) {
                    return 0;
               }
               reversed = newReversed;
               x /= 10;
          }
          return reversed;
     }
}
