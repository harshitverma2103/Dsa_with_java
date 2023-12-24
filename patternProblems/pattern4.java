package patternProblems;

public class pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result += 1;
            } else {
                result += 0;
            }
            System.out.println(result);
        }
    }
}
