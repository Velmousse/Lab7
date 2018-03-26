package Listes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList<Integer> test;
    private int taille = 3;

    @BeforeEach
    void setUp() {
        test = new LinkedList<>();
        for (int i = 0; i < taille; i++)
            test.add(i + 1);
    }

    @Test
    void add() {
        test.add(4);
        assertEquals((Integer) 4, test.get(3));
        //Cette section est déjà majoritairement testée avec le setUp()
    }

    @Test
    void add1() {
        for (int i = 0; i < 2; i++){
            test.add(i, 1);
            assertEquals((Integer) 1, test.get(i));
        }
    }

    @Test
    void set() {
        for (int i = 0; i < taille; i++) {
            test.set(i, 5);
            assertEquals((Integer) 5, test.get(i));
        }
    }

    @Test
    void get() {
        for (int i = 0; i < taille; i++) {
            assertEquals((Integer) (i + 1), test.get(i));
        }
    }

    @Test
    void remove() {
        test.remove(1);
        assertEquals((Integer) 3, test.get(1));
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    void size() {
        assertEquals( 3, test.size());
    }

}