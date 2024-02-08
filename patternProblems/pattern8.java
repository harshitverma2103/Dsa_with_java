package PatternProblems;

public class pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            String result = "";
            for (int j = 1; j <= i; j++) {
                result += i;
            }
            System.out.println(result);
        }
    }
}