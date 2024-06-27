package Greedy;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        float[] time = new float[target + 1];
        for(int i = 0; i < position.length; i++)
            time[position[i]] = (float) (target - position[i]) / speed[i];

        float max = 0;
        int count = 0;
        for(int i = time.length - 1; i >= 0; i--) {
            if(max < time[i]) {
                count++;
                max = time[i];
            }
        }
        return count;
    }
}
