package ArraysProblem;

import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 8, 7, 9, 1, 2, 3 };
        int num = arr.length;
        int missingNumber = findMissingElement(arr, num);
        System.out.println(missingNumber);
    }

    public static int findMissingElement(int arr[], int num) {
        Arrays.sort(arr);
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return num;
    }
}
