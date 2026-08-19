package Arrays.Best_Time_to_Buy_and_Sell_Stock_III;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        String[] input = sc.nextLine().trim().split(" ");

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(input[i]);
        }
        int[] left = new int[n];
        int[] right = new int[n];

        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i - 1],prices[i] - minPrice);
        }
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            right[i] = Math.max(right[i + 1],maxPrice - prices[i]);
        }
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit,left[i] + right[i]);
        }

        System.out.println(maxProfit);
    }
}
