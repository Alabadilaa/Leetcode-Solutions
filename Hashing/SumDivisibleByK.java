package Hashing;

import java.util.HashMap;
import java.util.Map;

public class SumDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> rest = new HashMap<>();
        rest.put(0, 1);
        int prefix = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int r = prefix % k;

            if (r < 0) {
                r += k;
            }
            
            if (rest.containsKey(r)) {
                ans += rest.get(r);
                rest.put(r, rest.get(r) + 1);
            } else {
                    rest.put(r, 1);
            }
        }

        return ans;
    }
}
