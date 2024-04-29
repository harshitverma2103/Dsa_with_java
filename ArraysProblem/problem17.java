package ArraysProblem;

public class problem17 {
    public static void main(String[] args) {
        int[] sum = {2, 7, 11, 15};
        int target = 18;
        int[] indices = twoSum(sum, target);
        if (indices != null) {
            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
            System.out.println("Elements: " + sum[indices[0]] + ", " + sum[indices[1]]);
            System.out.println("We got the target");
        } else {
            System.out.println("Target not found.");
        }
    }

    public static int[] twoSum(int[] sum, int target) {
        for (int i = 0; i < sum.length; i++) {
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[i] + sum[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
