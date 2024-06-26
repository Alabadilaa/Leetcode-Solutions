package Hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        int n = nums.length;

        for (int i: nums) {
            if (numset.contains(i)) {
                return true;
            }
            numset.add(i);
        }
        return false;
    }
}
