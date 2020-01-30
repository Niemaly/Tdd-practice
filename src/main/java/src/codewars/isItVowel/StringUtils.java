package src.codewars.isItVowel;

public class StringUtils {

    private static final String VOWELS = "AEIOU";

    public static Boolean isVowel(String s) {
        return s.matches("[" + VOWELS+ "]") || s.matches("[" + VOWELS.toLowerCase() + "]");
    }

}
