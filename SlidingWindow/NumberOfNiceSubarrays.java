package SlidingWindow;

public class NumberOfNiceSubarrays {
        public int numberOfSubarrays(int[] nums, int k) {
            int len = nums.length;
            int left = 0, right = 0;
            int ans = 0;
            int subs = 0;
            int odds = 0;
    
            while (right < len) {
                if (nums[right] % 2 == 1) {
                    odds++;
                    subs = 0;
                }
    
                while (odds == k) {
                    subs++;
                    if (nums[left] % 2 == 1) {
                        odds--;
                    }
                    left++;
                }
                ans += subs;
                right++;
            }
    
            return ans;
        }
}
