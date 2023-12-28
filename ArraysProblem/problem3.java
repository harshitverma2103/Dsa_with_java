package ArraysProblem;

public class problem3 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 8, 5 };
        System.out.println(smallestNum(arr));
    }

    public static int smallestNum(int arr[]) {
        int smallNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (smallNum > arr[i]) {
                smallNum = arr[i];
            }
        }
        return smallNum;
    }
}
