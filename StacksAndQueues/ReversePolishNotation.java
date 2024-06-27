package StacksAndQueues;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
    
        for (String s: tokens) {
            if (s.equals("+")) {
                int a = nums.pop();
                int b = nums.pop();
                nums.push(a+b);
            } else if (s.equals("-")) {
                int a = nums.pop();
                int b = nums.pop();
                nums.push(b-a);
            } else if (s.equals("*")) {
                int a = nums.pop();
                int b = nums.pop();
                nums.push(a*b);
            } else if (s.equals("/")) {
                int a = nums.pop();
                int b = nums.pop();
                nums.push(b/a);
            } else {
                nums.push(Integer.parseInt(s));
            } 
            
        }

        return nums.pop();
    }
}
