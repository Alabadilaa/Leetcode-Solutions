package Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public void tree(int open, int closed, int n, String s, List<String> ans) {
        if (closed > open || open > n) return;

        if (s.length() == n*2 && open == closed) {
            ans.add(s);
            return;
        }

        if (open < n) {
            tree(open + 1, closed, n, s+'(', ans);
        }
        if (closed < open) {
            tree(open, closed + 1, n, s+')', ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        if (n==0) return ans;
        tree(0, 0, n, "", ans);
        return ans;

    }
}
