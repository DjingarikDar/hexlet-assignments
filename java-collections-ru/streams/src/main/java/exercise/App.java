package exercise;

import java.util.List;



// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        long count = 0;
        count += emails.stream()
                .filter(email -> email.toLowerCase().contains("@gmail.com"))
                .count();
        count += emails.stream()
                .filter(email -> email.toLowerCase().contains("@yandex.ru"))
                .count();
        count += emails.stream()
                .filter(email -> email.toLowerCase().contains("@hotmail.com"))
                .count();
        return count;

    }
}
// END
