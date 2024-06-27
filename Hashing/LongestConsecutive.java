package Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len <= 1) return len;
        Set<Integer> set = new HashSet<>();
        int streak = 1;
        int prev = 1;

        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }

        for (int element : set) {
            if (!set.contains(element - 1)) {
                while (set.contains(element + prev)) {
                    prev++;
                }
            }
            streak = Math.max(prev, streak);
            prev = 1;
        }

        return streak;
    }
}
