package TwoPointers;

public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length-1; int f = 0;

        while(f < l) {
            int sum = numbers[l] + numbers [f];
            if (sum == target) {
                return new int[]{f+1, l+1};
            } else if (sum < target) {
                f = f+1;
            } else {
                l = l-1;
            }
        }
        return new int[]{};

    }
}