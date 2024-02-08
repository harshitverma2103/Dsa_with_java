package ArraysProblem;

import java.util.Arrays;

public class problem8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        findMinMaxSum(arr);
    }

    public static void findMinMaxSum(int[] arr) {
        Arrays.sort(arr);
        
        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
        }
        
        for (int i = 1; i < arr.length; i++) {
            maxSum += arr[i];
        }

        System.out.println(minSum + " " + maxSum);
    }
}
