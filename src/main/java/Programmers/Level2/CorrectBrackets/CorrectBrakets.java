package Programmers.Level2.CorrectBrackets;

import java.util.Stack;

public class CorrectBrakets {
    public boolean isCorrectBrackets(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char c : brackets.toCharArray()) {
            if (c == '(') {
                // 열린 괄호를 스택에 추가
                stack.push(c);
            }

            if (c == ')') {
                // 스택에 짝궁이 있는지 검사
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        // 스택이 비어있으면 올바른 괄호
        return stack.isEmpty();
    }
};
