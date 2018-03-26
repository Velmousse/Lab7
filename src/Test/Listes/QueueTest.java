package Listes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue<Integer> test = new Queue<>();
    private int taille = 3;

    @BeforeEach
    void setUp() {
        for (int i = 0; i < taille; i++)
            test.add(i + 1);
    }

    @Test
    void add() {
        test.add(4);
        for (int i = 0; i < 3; i++)
            test.remove();
        assertEquals((Integer) 4, test.peek());
    }

    @Test
    void remove() {
        assertEquals((Integer) 1, test.remove());
    }

    @Test
    void peek() {
        assertEquals((Integer) 1, test.peek());
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