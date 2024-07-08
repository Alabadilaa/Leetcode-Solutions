package Math;

public class WinnerCircularGame {
    public int findTheWinner(int n, int k) {
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }

        return result + 1;
    }
}
