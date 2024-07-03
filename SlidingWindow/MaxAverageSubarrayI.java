public class MaxAverageSubarrayI {
        public double findMaxAverage(int[] nums, int k) {
            int len = nums.length;
            double maxavr = 0;
            double temp = 0;
    
            for (int i = 0; i < k; i++) {
                temp += nums[i];
            }
            maxavr = temp;
            
            for (int j = k; j < len; j++) { 
                temp = temp + nums[j] - nums[j - k];
                maxavr = Math.max(temp, maxavr);
            }
    
            return maxavr/k;
        }
    }

