package patternProblems;

public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern (int n ) {
        String result = "";
        for (int i = n ; i >= 1 ; i--) {
            result += n;
            System.out.println(result);
            n--;
        }
        System.out.println();
    }
}
