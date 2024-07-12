package Greedy;

public class MaxScoreFromRemovingSubstrings {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        int score = 0;
        int idx = x > y ? sb.indexOf("ab") : sb.indexOf("ba");
        int firstScore = Math.max(x, y);
        int secondScore = Math.min(x, y);

        while (idx != -1) {
            sb.delete(idx, idx + 2);
            score += firstScore;
            idx = x > y ? sb.indexOf("ab", idx-2) : sb.indexOf("ba", idx-2);
        }

        int idy = x > y ? sb.indexOf("ba") : sb.indexOf("ab");

        while (idy != -1) {
            sb.delete(idy, idy + 2);
            score += secondScore;
            idy = x > y ? sb.indexOf("ba", idy-2) : sb.indexOf("ab", idy-2);
        }

        return score;
    }
}
