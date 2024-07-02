package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOf2ArraysII {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> common = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;

        for (int i = 0; i < len1 && j < len2;) {
            if (nums1[i] == nums2[j]) {
                common.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] array = new int[common.size()];
        for (int k = 0; k < common.size(); k++) array[k] = common.get(k);

        return array;
    }
}

