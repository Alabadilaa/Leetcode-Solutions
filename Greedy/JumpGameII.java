package Greedy;

public class JumpGameII {
    public int jump(int[] nums) {
        int reachable = 0;
        int jumps = 0;
        int curr = 0;
       for(int i = 0; i < nums.length - 1; i ++) {
           reachable = Math.max(reachable, i + nums[i]);
           if (i == curr) {
            jumps++;
            curr = reachable;
           }
           if (curr >= nums.length - 1) break;
       } 
       return jumps;
    }
}
