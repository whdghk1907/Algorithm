package BaeckJoon.testStep19.Stack;

import BaeckJoon.Step19.Stack.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    void setStack() {
        stack = new Stack(3);
    }

    @Test
    void push() {
        //given
        int number = 1;

        //when
        stack.push(number);

        //then
        assertArrayEquals( new int[]{number, 0,0} , stack.getIntArr());
    }

    @Test
    void pop() {
        //given
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //when
        int result = stack.pop();

        //then
        assertAll(
            () -> assertEquals(3, result),
            () -> assertArrayEquals(new int[]{1,2,0}, stack.getIntArr())
        );
    }

    @Test
    void size() {
        //given
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // when
        int result = stack.size();

        //then
        assertEquals(3, result);
    }

    @Test
    void empty() {
        //given
        stack.push(1);

        //when
        int result = stack.empty();

        //then
        assertEquals(0, result);
    }

    @Test
    void top() {
        //given
        stack.push(1);

        //when
        int result = stack.top();

        //then
        assertEquals(1, result);
    }
}
