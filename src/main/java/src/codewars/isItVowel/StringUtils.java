package src.codewars.isItVowel;

public class StringUtils {

    private static final String VOWELS = "[AEIOUaeiou]";

    public static Boolean isVowel(String s) {
        return s.matches(VOWELS);
    }

}
