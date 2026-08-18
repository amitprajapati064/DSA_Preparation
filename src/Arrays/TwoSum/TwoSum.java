package Arrays.TwoSum;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        String[] input = sc.nextLine().trim().split(" ");

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int target = Integer.parseInt(sc.nextLine().trim());

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int req = target - nums[i];

            if (map.containsKey(req)) {
                System.out.println(map.get(req) + " " + i);
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("-1 -1");
    }
}