package exercise;

import java.util.List;


// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> list, int count) {
        return list.stream()
                .sorted(Home::compareTo)
                .limit(count)
                .map(Object::toString)
                .toList();
    }
}
// END
