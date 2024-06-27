package Hashing;

public class ScoreOfString {
    
        public int scoreOfString(String s) {
            int len = s.length();
            int score = 0;
    
            for(int i = 1; i < len; i++) {
                int asci1 = (int) s.charAt(i-1);
                int asci2 = (int) s.charAt(i);
                int diff = asci1 - asci2;
                score += Math.abs(diff);
            }
    
            return score;
        }
    
}
