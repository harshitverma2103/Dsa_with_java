package PatternProblems;

public class pattern3 {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            String result = "";
            for (int j = 1; j <= i; j++) {
                result += j;
            }
            System.out.println(result);
        }
        System.out.println();
    }
}
