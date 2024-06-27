package SlidingWindow;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int zeros = 0;
        int max_streak = 0;
        
        for (int right = 0; right < len; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            
            max_streak = Math.max(max_streak, right - left + 1);
        }

        return max_streak;
    }
}
