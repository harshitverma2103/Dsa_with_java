package PatternProblems;

public class pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int num) {
        String result1 = "";
        int number = num;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                result1 += i;
            } else {
                result1 += i;
            }
            System.out.println(result1);
        }
        if (result1.length() == num) {
            for (int i = 1; i < number; i++) {
                String result2 = "";
                for (int j = 1; j < num ; j++) {
                    result2 += j;
                }
                num--;
                System.out.println(result2);
            }
        }
    }
}
