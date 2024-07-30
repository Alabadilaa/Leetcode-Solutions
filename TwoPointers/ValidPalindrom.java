package TwoPointers;

public class ValidPalindrom {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while( first <= last) {
            char firstChar = s.charAt(first);
            char lastChar = s.charAt(last);
            if (!Character.isLetterOrDigit(firstChar)) first++;
            else if (!Character.isLetterOrDigit(lastChar)) last--;
            else {
                if (Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)) return false;
                first++;
                last--;
            }
        }

        return true;
    }
}
