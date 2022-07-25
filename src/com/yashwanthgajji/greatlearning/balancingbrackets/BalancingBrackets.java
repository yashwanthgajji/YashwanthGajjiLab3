package com.yashwanthgajji.greatlearning.balancingbrackets;

import java.util.Stack;

public class BalancingBrackets {
    private final Stack<Character> bracketsStack;
    private final String input;

    BalancingBrackets(String input) {
        bracketsStack = new Stack<>();
        this.input = input;
    }

    public boolean isBalance() {
        for(int i=0;i<input.length();i++) {
            char currBracket = input.charAt(i);
            switch (currBracket) {
                case '{', '[', '(' -> bracketsStack.push(currBracket);
                case ')' -> {
                    if (!bracketsStack.isEmpty() && bracketsStack.peek() == '(') {
                        bracketsStack.pop();
                    } else {
                        return false;
                    }
                }
                case '}' -> {
                    if (!bracketsStack.isEmpty() && bracketsStack.peek() == '{') {
                        bracketsStack.pop();
                    } else {
                        return false;
                    }
                }
                case ']' -> {
                    if (!bracketsStack.isEmpty() && bracketsStack.peek() == '[') {
                        bracketsStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return bracketsStack.isEmpty();
    }
}
