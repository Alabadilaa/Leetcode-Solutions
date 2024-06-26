package Hashing;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        int[] diffs = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                diffs[idx] = nums[i];
                idx++;
                k++;
            }
        }
        for (int i = 0; i < idx; i++) {
            nums[i] = diffs[i];
        }
        return k;
    }
}
