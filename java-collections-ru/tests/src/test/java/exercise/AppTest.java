package exercise;



import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    private final List<Integer> list = new ArrayList<>();

    @BeforeEach
    void prepareListForTest() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    }

    @Test
    void testTake() {
        // BEGIN
        List<Integer> actual1 = App.take(list, 3);
        List<Integer> actual2 = App.take(list, 0);
        List<Integer> actual3 = App.take(list, 100);
        Assertions.assertEquals(List.of(1, 2, 3), actual1);
        Assertions.assertTrue(actual2.isEmpty());
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5), actual3);


        // END
    }

    @AfterEach
    void clearList() {
        list.clear();
    }
}
