package SlidingWindow;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public int maxDistance(int[] position, int m) {
        int len = position.length;
        int res = -1;
        Arrays.sort(position);
        int left = 1;
        int right = position[len - 1] - position[0];

        while (left <= right) {
            int balls = 1;
            int mid = (right + left) / 2;
            int last = position[0];

            for (int i = 1; i < len; i++) {
                if (position[i] - last >= mid) {
                    last = position[i];
                    balls++;
                }
            }

            if (balls >= m) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}

