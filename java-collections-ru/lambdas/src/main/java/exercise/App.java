package exercise;

import java.util.stream.Stream;

import static java.util.Arrays.stream;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        if (image.length == 0) {
            return new String[][]{};
        }
        String[][] duplicationStringInMatrix = stream(image).
                map(App::getDuplicationStringInMatrix)
                .toArray(String[][]::new);
        Stream.Builder<String[]> streamBuilder = Stream.builder();
        stream(duplicationStringInMatrix).
                forEach(stringInMatrix -> streamBuilder.add(stringInMatrix).add(stringInMatrix));
        return streamBuilder.build().toArray(String[][]::new);
    }

    private static String[] getDuplicationStringInMatrix(String[] arrayString) {
        StringBuilder resultString = new StringBuilder();
        for (String s : arrayString) {
            resultString.append(s);
            resultString.append(s);
        }
        return resultString.toString().split("");

    }
}
// END
