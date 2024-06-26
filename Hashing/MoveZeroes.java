package Hashing;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int temp = 0;
        int len = nums.length;

        for (int right = 0; right < len; right++) {
            if (nums[right] != 0) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}