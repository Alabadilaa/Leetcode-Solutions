package TwoPointers;

import java.util.Arrays;

public class BoatsSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int light = 0;
        int heavy = people.length - 1;

        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                light++;
            }
            heavy--;
            boats++;
        }

        return boats;
    }
}
