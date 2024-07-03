package SlidingWindow;

public class MaxNumOfVowelsInSubstring {

        public int maxVowels(String s, int k) {
            int len = s.length();
            char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
            int count = 0;
            int temp = 0;
    
            for (int i = 0; i < k; i++) {
                for (char c : vowels) {
                    if (s.charAt(i) == c) {
                        temp++;
                    }
                }
            }
            count = temp;
    
            for (int j = k; j < len; j++) {
                for (char c : vowels) {
                    if (s.charAt(j) == c) {
                        temp++;
                    }
                    if (s.charAt(j-k) == c) {
                        temp--;
                    }
                }
                count = Math.max(temp, count);
            }
            
    
            return count;
        }
    }

