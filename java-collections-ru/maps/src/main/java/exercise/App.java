package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<>();
        }
        final int startValue = 1;
        String[] arrSentence = sentence.trim().split(" ");
        Map<String, Integer> mapWordAndCount = new HashMap<>();
        for (String word : arrSentence) {
            if (mapWordAndCount.containsKey(word)) {
                mapWordAndCount.put(word, mapWordAndCount.get(word) + 1);
            } else {
                mapWordAndCount.put(word, startValue);
            }
        }
        return mapWordAndCount;

    }

    public static String toString(Map<String, Integer> mapWords) {
        if (mapWords.isEmpty()) {
            return "{}";
        }
        StringBuilder resultStr = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> word : mapWords.entrySet()) {
            resultStr.append("  ")
                    .append(word.getKey())
                    .append(": ")
                    .append(word.getValue())
                    .append("\n");
        }
        resultStr.append("}");
        return resultStr.toString();

    }
}
//END
