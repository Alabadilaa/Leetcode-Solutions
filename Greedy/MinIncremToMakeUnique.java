package Greedy;

import java.util.Arrays;

public class MinIncremToMakeUnique {

    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int min = nums[0];
        int count = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] <= min) {
                count += min + 1 - nums[i];
                nums[i] = min + 1;
                min = nums[i];
            } else {
                min = nums[i];
            }
        }

        return count;
    }
}

