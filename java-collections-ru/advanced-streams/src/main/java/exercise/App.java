package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String data) {
        List<String> list = Arrays.stream(data.split("\n")).toList();
        String result = list.stream()
                .filter(x -> x.startsWith("environment"))
                .flatMap(s -> Stream.of(s.split(",")))
                .filter(s -> s.contains("X_FORWARDED"))
                .map(s -> s.replace("environment=", "")
                        .replace("\"", "")
                        .replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
        System.out.println(result);




        return result;
    }
}
//END
