package Arrays.Best_Time_to_Buy_and_Sell_Stock;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        String[] input = sc.nextLine().trim().split(" ");

        int [] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=Integer.parseInt(input[i]);
        }

        int buy=prices[0];
        int profit=0;

        //Approach 1
        for(int i=1;i<n;i++){
            if(buy>prices[i]){
                buy=prices[i];
            } else if (prices[i]-buy>profit) {
                profit=prices[i]-buy;
            }
        }
        System.out.println(profit);

        //Approach 2
        int []min=new int[n];
        min[0]=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
            min[i]=Math.min(prices[i],min[i-1]);
        }
        for(int i=1;i<n;i++){
            max=Math.max(max,prices[i]-min[i-1]);
        }

        System.out.println(max);
    }
}
