package codewarsTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.codewars.isItVowel.StringUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {


    static Stream<Arguments> argumentsTrue() {

        return Stream.of(
                Arguments.of("a"),
                Arguments.of("E"),
                Arguments.of("i"),
                Arguments.of("O"),
                Arguments.of("U"),
                Arguments.of("OO"),
                Arguments.of("II")
        );
    }


    static Stream<Arguments> argumentsFalse() {
        return Stream.of(
                Arguments.of("ou"),
                Arguments.of("z"),
                Arguments.of("lol"),
                Arguments.of("")
        );
    }



    @ParameterizedTest
    @MethodSource("argumentsTrue")
    public void fixedTrue(String input) {
        assertTrue(StringUtils.isVowel(input));
    }

    @ParameterizedTest
    @MethodSource("argumentsFalse")
    public void fixedFalse(String input) {
        assertFalse(StringUtils.isVowel(input));
    }

}

