package ArraysProblem;

public class problem5 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 7 };
        multiplyBy3(arr);
    }

    public static void multiplyBy3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 3);
        }
    }
}
