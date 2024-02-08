package PatternProblems;

public class pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        String result = "";
        for (int i = n; i >= 1; i--) {
            result += "*";
            System.out.println(result);
        }
        n--;
    }
}
