package TwoPointers;

public class SortColors {
        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        public void sortColors(int[] nums) {
            int len = nums.length;
            int red = -1;
            int blue = len;
            int i = 0;
    
            while (i < blue) {
                if (nums[i] == 0) {
                    red++;
                    swap(nums, i, red);
                    i++;
                } else if (nums[i] == 2) {
                    blue--;
                    swap(nums, i, blue);
                } else {
                    i++;
                }
            }
        }
    }

