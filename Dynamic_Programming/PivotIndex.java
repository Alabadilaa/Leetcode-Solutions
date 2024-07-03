package Dynamic_Programming;

public class PivotIndex {
        public int pivotIndex(int[] nums) {
            int len = nums.length;
            if (len == 0) return -1;
    
            int[] left = new int[len];
            int[] right = new int[len];
    
            
            left[0] = nums[0];
            for (int i = 1; i < len; i++) {
                left[i] = left[i - 1] + nums[i];
            }
    
            
            right[len - 1] = nums[len - 1];
            for (int j = len - 2; j >= 0; j--) {
                right[j] = right[j + 1] + nums[j];
            }
    
            
            for (int k = 0; k < len; k++) {
                int leftSum = (k == 0) ? 0 : left[k - 1];
                int rightSum = (k == len - 1) ? 0 : right[k + 1];
                if (leftSum == rightSum) {
                    return k;
                }
            }
    
            return -1;
        }
    }

