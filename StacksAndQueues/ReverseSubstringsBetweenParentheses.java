package StacksAndQueues;

import java.util.Stack;

public class ReverseSubstringsBetweenParentheses {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(current);
                current = new StringBuilder();
            } else if (s.charAt(i) == ')') {
                current.reverse();
                if (!st.isEmpty()) {
                    st.peek().append(current);
                    current = st.pop();
                }
            } else {
                current.append(s.charAt(i));
            }
        }
        
        return current.toString();
    }
}
