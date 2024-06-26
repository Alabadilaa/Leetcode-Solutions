package Hashing;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        int[] res = new int[len];

        for (int i = 1; i < len; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        for (int j = len - 2; j >= 0; j--) {
            right[j] = right[j+1] * nums[j+1];
        }

        for (int k = 0; k < len; k++) {
            res[k] = left[k] * right[k];
        }

        return res;
    }
}
