package Arrays.Best_Time_to_Buy_and_Sell_Stock_II;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        String[] input = sc.nextLine().trim().split(" ");

        int [] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=Integer.parseInt(input[i]);
        }

        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        System.out.println(profit);
    }
}
