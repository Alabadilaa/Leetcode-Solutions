package Greedy;

public class CanPlaceFlowers {

        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int len = flowerbed.length;
            int plots = 0;
    
            for (int i = 0; i < len; i++) {
                if (flowerbed[i] == 0) {
                    if ((i == 0 || flowerbed[i-1] == 0) && (i == len-1 || flowerbed[i+1] == 0)) {
                        flowerbed[i] = 1;
                        plots++;
                    }
                } else {
                    continue;
                }
            }
    
            return n <= plots;
        }
    }

