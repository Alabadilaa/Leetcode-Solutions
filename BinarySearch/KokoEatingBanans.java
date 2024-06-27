package BinarySearch;

public class KokoEatingBanans {
    public int minEatingSpeed(int[] piles, int h) {
        int mid = 0;
        int left = 1;
        int right = 0;

        for (int pile: piles) {
            right = Math.max(pile, right);
        }

        while (left < right) {
            mid = (right + left) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }
            if (hours > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
