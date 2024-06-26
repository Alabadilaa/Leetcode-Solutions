package TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int len = height.length;
        int right = len - 1;
        int left = 0;
        int mini;
        int maxi = 0;

        while (len != 0) {
            mini = Math.min(height[left], height[right]);
            maxi = Math.max(maxi, mini*(right - left));

            if (mini == height[left]) {
                left++;
            } else {
                right--;
            }

            len--;
        }

        return maxi;
    }
}
