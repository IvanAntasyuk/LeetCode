package leetcode;

import java.util.Stack;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (stack.isEmpty())
                return false;
            else if (ch == ')' && stack.pop() != '(')
                return false;
            else if (ch == ']' && stack.pop() != '[')
                return false;
            else if (ch == '}' && stack.pop() != '{')
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid(new String("()[]{}")));
        System.out.println(isValid(new String("(]")));
        System.out.println(isValid(new String("([)]")));
        System.out.println(isValid(new String("{[]}")));
    }
}
