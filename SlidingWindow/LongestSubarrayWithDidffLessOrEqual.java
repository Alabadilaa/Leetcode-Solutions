package SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class LongestSubarrayWithDidffLessOrEqual {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0, right = 0, n = nums.length, res = 0;
        Deque<Integer> mini = new LinkedList<>();
        Deque<Integer> maxi = new LinkedList<>();

        while (right < n) {
            while (!mini.isEmpty() && mini.peekLast() > nums[right]) mini.pollLast();
            mini.addLast(nums[right]);

            while (!maxi.isEmpty() && maxi.peekLast() < nums[right]) maxi.pollLast();
            maxi.addLast(nums[right]);

            while (maxi.peekFirst() - mini.peekFirst() > limit) {
                if (nums[left] == maxi.peekFirst()) maxi.pollFirst();
                if (nums[left] == mini.peekFirst()) mini.pollFirst();
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
