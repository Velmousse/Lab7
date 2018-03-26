package Listes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack<Integer> test = new Stack<>();
    private int taille = 3;

    @BeforeEach
    void setUp() {
        for (int i = 0; i < taille; i++)
            test.push(i + 1);
    }

    @Test
    void push() {
        test.push(4);
        assertEquals((Integer) 4, test.peek());
    }

    @Test
    void pop() {
        assertEquals((Integer) 3, test.pop());
        assertEquals((Integer) 2, test.pop());
    }

    @Test
    void peek() {
        assertEquals((Integer) 3, test.peek());
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    void size() {
        assertEquals(3, test.size());
    }

}