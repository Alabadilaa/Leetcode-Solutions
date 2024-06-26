package BinarySearch;

public class MinNumOfDaysToMakeBouquets {
            public int minDays(int[] bloomDay, int m, int k) {
            if (bloomDay.length < (long) m * k) return -1;
    
            int left = Integer.MAX_VALUE;
            int right = 0;
    
            for (int day : bloomDay) {
                left = Math.min(left, day);
                right = Math.max(right, day);
            }
    
            while (left < right) {
                int mid = (right + left) / 2;
                int flowers = 0;
                int bouquets = 0;
    
                for (int i = 0; i < bloomDay.length; i++) {
                    if (bloomDay[i] <= mid) {
                        flowers++;
                        if (flowers == k) {
                            bouquets++;
                            flowers = 0;
                        }
                    } else {
                        flowers = 0;
                    }
    
                    if (bouquets >= m) {
                        break;
                    }
                }
    
                if (bouquets >= m) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
    
            return left;
        }
    }
    
