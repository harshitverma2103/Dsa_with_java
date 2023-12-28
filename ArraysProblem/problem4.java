package ArraysProblem;

public class problem4 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int n = arr.length;
        int result = arraySortedOrNot(arr, n);
        if (result == 1) {
            System.out.println("The given array is shorted.");
        } else {
            System.out.println("The given array is not shorted.");
        }
    }

    public static int arraySortedOrNot(int arr[], int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return 0;
            }
        }
        return 1;
    }
}
