package Arrays.Maximum_Subarray;

import java.util.Scanner;

public class Maximum_Subarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        String[] input = sc.nextLine().trim().split(" ");

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // logic part

        int cs = nums[0];
        int ms = nums[0];

        for (int i = 1; i < n; i++) {

            cs = Math.max(cs + nums[i], nums[i]);

            ms = Math.max(cs, ms);
        }

        System.out.println(ms);
    }
}