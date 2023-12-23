package patternProblems;

public class pattern1 {
    public static void main(String[] args) {
        int n = 6;
        pattern(n);
    }

    public static void pattern(int n) {
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(); // empty line
        }
    }
}
