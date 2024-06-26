package Hashing;

public class RemoveDuplicatesfromSortedArray {
        public int removeDuplicates(int[] nums) {
            int temp = 1;
            int count = 1;
            int len = nums.length;

            for (int i = 1; i < len; i++) {
                if (nums[i] != nums[i-1]) {
                    count++;
                    nums[temp] = nums[i];
                    temp++;
                }
            }
            // if ((len >= 2) && (nums[len-1] != nums[len-2])) {
            //     nums[temp] = nums[len-1];
            //     count++;
            // }
            if (len == 1) {
                return 1;
            }
            return count;
        }

}

