package Hashing.Contains_Duplicate_II;

import java.util.HashMap;
import java.util.Scanner;

public class Contains_Duplicate_II {
    public static void main(String[] args) {
        //Input Style --> TCS Pattern
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] input = sc.nextLine().trim().split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        int k= Integer.parseInt(sc.nextLine().trim());

        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(nums[i])){
                int j= h.get(nums[i]);

                if(i-j<=k){
                    System.out.println("True");
                    return;
                }
            }
            h.put(nums[i],i);
        }
        System.out.println("False");
    }
}
