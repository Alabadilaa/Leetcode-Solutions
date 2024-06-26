package Hashing;

import java.util.HashMap;
import java.util.Map;

/*1. Two Sum
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        int len = nums.length;

        for (int i = 0; i < len; i++){
            int diff = target - nums[i];

            if (seen.containsKey(diff)) {
                return new int[]{seen.get(diff), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}