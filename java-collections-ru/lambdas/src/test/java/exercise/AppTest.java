package exercise;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


// BEGIN
class AppTest {
    @Test
    void testEnlargeArrayImageWithEmpty() {
        String[][] image = {};
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test1EnlargeArrayImage() {
        String[][] image = {{"*"}};
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*"},
                {"*", "*"}
        };
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void test2EnlargeArrayImage() {
        String[][] image = {{"*", "-", "*"}};
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "*", "*"}
        };
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void test3EnlargeArrayImage() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", "-", "-", "*"},
                {"*", "-", "-", "*"},
                {"*", "*", "*", "*"}

        };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "-", "-", "-", "-", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };
        assertThat(actual).isEqualTo(expected);
    }

}
// END
