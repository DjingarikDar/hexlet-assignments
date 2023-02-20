package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String text, String testWord) {
        String[] arrayTestWord = testWord.split("");
        List<String> listText = new ArrayList<>(Arrays.asList(text.split("")));
        for (var str : arrayTestWord) {
            if (!listText.contains(str.toLowerCase())) {
                return false;
            }
            listText.remove(str);
        }
        return true;
    }
}
//END
