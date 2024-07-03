package Hashing;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = 0;
        List<Boolean> result = new ArrayList<>(len);

        for (int candy: candies) {
            max = Math.max(candy, max);
        }

        for (int j: candies) {
            result.add(j + extraCandies >= max);
        }
        return result;
    }
}

