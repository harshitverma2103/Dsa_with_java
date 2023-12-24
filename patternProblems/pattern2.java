package patternProblems;

public class pattern2 {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        String result = "";
        for(int i = 1; i <= n; i++) {
            result += i;
            System.out.println(result);
        }
    }
}