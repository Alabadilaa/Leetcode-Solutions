package Math;

public class HappyNumber {
    public int square(int n) {
        int ans = 0;
        while(n > 0) {
            int r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (fast != slow);

        return slow == 1;
    }
}
