package Hashing;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int count = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] == max) {
                count++;
                max = nums[i];
            } else {
                count--;
                if (count == -1) {
                    max = nums[i];
                    count++;
                }
            }
        }

        return max;
    }
}
