package src.codewars.isItVowel;

public class StringUtils {

    private static final String VOWELS = "AEIOU";


    public static Boolean isVowel(String s) {

        if (s.length() > 1)
            return false;

        for (char vowel : VOWELS.toCharArray()) {
            if (s.toUpperCase().contains(String.valueOf(vowel))) {
                return true;
            }
        }

        return false;
    }
}
