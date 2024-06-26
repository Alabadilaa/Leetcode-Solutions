package StacksAndQueues;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        
        char[] open = {'(', '{', '['};
        char[] close = {')', '}', ']'};
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            boolean isOpen = false;

            for (char value : open) {
                if (c == value) {
                    stack.push(c);
                    isOpen = true;
                    break;
                }
            }

            if (!isOpen) {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                boolean matchFound = false;

                for (int j = 0; j < close.length; j++) {
                    if (c == close[j] && top == open[j]) {
                        matchFound = true;
                        break;
                    }
                }

                if (!matchFound) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}