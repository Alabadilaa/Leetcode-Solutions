package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> arr = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i])) return true;
            arr.add(nums[i]);
            if (arr.size() > k) arr.remove(nums[i-k]);
        }

        return false;
    }
}
