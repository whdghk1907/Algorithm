package Programmers.Level2.PairwiseRemoval;

import java.util.Stack;

public class PairwiseRemoval {
    public int pairwiseRemoval(String given) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < given.length(); i++) {
            char target = given.charAt(i);

            if (!stack.isEmpty() && target == stack.peek()) {
                stack.pop();
            } else {
                stack.push(target);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}