package TwoPointers;

public class AppendChars {
        public int appendCharacters(String s, String t) {
            int count = 0;
    
            for(int i = 0; i < s.length(); i++) {
                if (count == t.length()) {break;}
                if(s.charAt(i) == t.charAt(count)) {
                    count++;
                }
            }
            
            int tadd = t.length() - count;
            
            return tadd;
        }
    }

