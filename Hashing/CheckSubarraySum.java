package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) return false;

        Map<Integer, Integer> rest = new HashMap<>();
        rest.put(0, -1);
        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int r = prefix % k;
            
            if (rest.containsKey(r)) {
                if (i - rest.get(r) >= 2) {
                    return true;
                } 
            } else {
                    rest.put(r, i);
            }
        }

        return false;
    }
}