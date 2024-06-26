package Hashing;
import java.util.Arrays;

public class ValidAnagram {

        public boolean isAnagram(String s, String t) {
            char[] ss = s.toCharArray();
            char[] ts = t.toCharArray();

            Arrays.sort(ss);

            Arrays.sort(ts);

            return Arrays.equals(ss, ts);
        }
    }
