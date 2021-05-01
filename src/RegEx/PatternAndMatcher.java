package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        String text = "My own complete happiness, and the home-centred " +
                "interests which rise Hatson@yandex.com up around the man who first finds himself " +
                "master of his own establishment, were sufficient to absorb all" +
                " my attention, Holmes@mail.ru while Holmes, who loathed every form of society with" +
                " his whole Bohemian soul, remained in our Watson@google.ru lodgings in Baker Street, " +
                "buried among his old books, and alternating from week to week between " +
                "cocaine and ambition, the drowsiness of the drug, and the fierce energy " +
                "of his own keen nature.";

        Pattern email = Pattern.compile("(\\w+)@(\\w+)\\.(ru|com)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println();
        }
    }
}
