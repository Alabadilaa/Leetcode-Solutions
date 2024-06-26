package TwoPointers;

public class ReverseString {
    public void reverseString(char[] s) {
        int len = s.length;
        char temp = s[0];

        for(int i = 0; i < len / 2; i++) {
            temp = s[len - i - 1];
            s[len - i - 1] = s[i];
            s[i] = temp;
        }

    }
}