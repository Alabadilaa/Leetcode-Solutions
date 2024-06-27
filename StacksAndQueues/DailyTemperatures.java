package StacksAndQueues;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }

        return answer;
    }
}
