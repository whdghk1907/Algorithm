package testStep19.Stack;

import Step19.Stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    Stack stack;

    @BeforeEach
    void setStack() {
        stack = new Stack(1);
    }


    @Test
    void push() {
        //given
        int number = 1;

        //when
        stack.push(number);

        //then
        assertArrayEquals(Stack.intArr, new int[]{number});
    }

    @Test
    void pop() {
        //given


        //when
        stack.pop();

        //then
        assertArrayEquals(Stack.intArr, new int[]{2,3});
    }
}
