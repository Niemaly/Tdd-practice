package codewarsTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.codewars.isItVowel.StringUtils;
import src.codewars.pandigitalSequence.Pandigital;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PandigitalTest {

    static Stream<Arguments> arguments(){
        return Stream.of(
                Arguments.of(0L, 5, new long[]{1023456789L, 1023456798L, 1023456879L, 1023456897L, 1023456978L}),
                Arguments.of(9876543000L, 5, new long[]{9876543012L, 9876543021L, 9876543102L, 9876543120L, 9876543201L}),
                Arguments.of(9999999999L, 1, new long[]{}),
                Arguments.of(-123456789L, 1, new long[]{1023456789L})
                );


    }

    @ParameterizedTest
    @MethodSource("arguments")
    public void fixedTrue(long offset, int size, long[] expected) {
        assertTrue(Arrays.equals(Pandigital.getSequence(offset, size), expected));
    }
}

