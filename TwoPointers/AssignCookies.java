package TwoPointers;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int kids = 0; 
        int cookies = 0;
        int content = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (kids < g.length && cookies < s.length) {
            if (g[kids] <= s[cookies]) {
                content++;
                kids++;
                cookies++;
            }
            else cookies++;

        }

        return content;
    }
}
