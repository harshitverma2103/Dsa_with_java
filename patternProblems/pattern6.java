package patternProblems;

public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result = i + result;
            System.out.println(result);
        }
    }
}
