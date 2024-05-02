package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class problem10 {
    public static void main(String[] args) {
        String s = "abccccdd";
        int longestPalindromeLength = longestPalindrome(s);
        System.out.println("Length of the longest palindromic substring: " + longestPalindromeLength);
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int maxLength = 0;
        boolean hasOddCount = false;

        for (int count : frequencyMap.values()) {
            maxLength += count / 2 * 2;
            if (count % 2 != 0) {
                hasOddCount = true;
            }
        }

        if (hasOddCount) {
            maxLength++;
        }

        return maxLength;
    }
}
