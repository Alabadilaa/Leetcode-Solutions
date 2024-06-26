package Dynamic_Programming;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxim = nums[0];
        if (n == 1) {
            return nums[0];
        }
        for (int num : nums) {
            sum += num;
            maxim = Math.max(maxim, sum);
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxim;
    }
}