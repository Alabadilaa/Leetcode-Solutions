package SlidingWindow;

public class GrumpyBookstoreOwner {

        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int len = customers.length;
            int satisfied = 0;
    
            for (int i = 0; i < len; i++) {
                if (grumpy[i] == 0)
                    satisfied += customers[i];
            }
    
            int curr = 0;
            int left = 0;
            int best = 0;
    
            for (int j = 0; j < len; j++) {
                curr += customers[j] * grumpy[j];
    
                if (j - left + 1 == minutes) {
                    best = Math.max(curr, best);
                    curr -= customers[left] * grumpy[left];
                    left++;
                }
            }
    
            return satisfied + best;
        }
    
}
