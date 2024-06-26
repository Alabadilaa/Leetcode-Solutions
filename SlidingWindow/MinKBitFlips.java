package SlidingWindow;

public class MinKBitFlips {
    public int minKBitFlips(int[] nums, int k) {
        int len = nums.length;
        int flipped = 0;
        int[] flips = new int[len];
        int res = 0;

        for (int i = 0; i < len; i++) {
            if (i >= k) {
                flipped ^= flips[i - k];
            }
            if (nums[i] == flipped) {
                if (i + k > len) {
                    return -1;
                }
                res++;
                flipped ^= 1;
                flips[i] = 1;
            }
        }

        return res;
    }
}
