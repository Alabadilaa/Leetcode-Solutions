public class ThreeConsecutiveOdds {

        public boolean threeConsecutiveOdds(int[] arr) {
            int count = 0;
            int len = arr.length;
            int i = 0;
            
            while (count < 3 && i < len) {
                if (arr[i] % 2 == 1) {
                    count++;
                } else {
                    count = 0;
                }
                i++;
            }
    
            return count == 3;
        }
    
}
