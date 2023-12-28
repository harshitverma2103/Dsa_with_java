package ArraysProblem;

public class problem2 {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 14, 10, 5 };
        System.out.println(largestNum(arr));
    }

    public static int largestNum(int arr[]) {
        int largeNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeNum) {
                largeNum = arr[i];
            }
        }
        return largeNum;
    }
}
