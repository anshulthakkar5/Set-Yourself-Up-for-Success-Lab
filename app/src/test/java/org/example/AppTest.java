package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    void testRemoveDuplicatesIntegers() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));
        ArrayList<Integer> result = App.removeDuplicates(list);

        assertEquals(Arrays.asList(1, 2, 3, 4), result);
    }

    @Test
    void testRemoveDuplicatesStrings() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
        ArrayList<String> result = App.removeDuplicates(list);

        assertEquals(Arrays.asList("A", "B", "C"), result);
    }

    @Test
    void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = App.removeDuplicates(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testNoDuplicates() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> result = App.removeDuplicates(list);

        assertEquals(Arrays.asList(1, 2, 3), result);
    }
}
