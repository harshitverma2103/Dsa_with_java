package ArraysProblem;

class Problem26 {
    public static void main(String[] args) {
        Problem26 solution = new Problem26();

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(arr));
    }

    public int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : arr) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
