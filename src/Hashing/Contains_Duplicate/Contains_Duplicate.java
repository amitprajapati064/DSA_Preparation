package Hashing.Contains_Duplicate;

import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicate {
    public static void main(String[] args) {
        //Input Style --> TCS Pattern
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String [] input = sc.nextLine().trim().split(" ");
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        //Logic part
        HashSet<Integer> h = new HashSet<>();
        for(int num:nums){
            if(h.contains(num)){
                System.out.println("True");
                return;
            }
            h.add(num);
        }

        System.out.println("False");
    }
}
