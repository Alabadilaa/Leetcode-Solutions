package Hashing;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int ops = 0;
        for (String log: logs) {
            if (log.equals("../") && ops > 0) ops--;
            else if (log.equals("./") || (log.equals("../") && ops == 0));
            else ops++;
        }

        return ops;
    }
}
