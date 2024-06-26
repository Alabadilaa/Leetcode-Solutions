package Hashing;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        String[] clean = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = clean.length - 1; i >= 0; i--) {
            res.append(" ").append(clean[i]);
        }
        return  res.toString().trim().replaceAll("\\s+", " ");
    }
}