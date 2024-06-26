package Greedy;

public class PatchingArray {
        public int minPatches(int[] nums, int n) {
            long missing = 1;
            int i = 0;
            int patches = 0;
    
            while (missing <= n) {
                if (i < nums.length && nums[i] <= missing) {
                    missing += nums[i];
                    i++;
                } else {
                    patches++;
                    missing += missing;
                }
            }
    
            return patches;
        }
    }

