
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.fizzBuzz.FizzBuzzService;


import java.io.IOException;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzServiceTest {

    static Stream<Arguments> arguments() {

        return Stream.of(
                Arguments.of(1, "1"), // null strings should be considered blank
                Arguments.of(2, "2"),
                Arguments.of(7, "7"),
                Arguments.of(3, "Fizz"),
                Arguments.of(6, "Fizz"),
                Arguments.of(9, "Fizz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(10, "Buzz"),
                Arguments.of(20, "Buzz"),
                Arguments.of(15, "FizzBuzz"),
                Arguments.of(30, "FizzBuzz"),
                Arguments.of(60, "FizzBuzz"),
                Arguments.of(13, "Shizz"),
                Arguments.of(26, "Shizz")



        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void allFizzBuzzTest(int input, String expected) throws IOException {

        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        int when = input;

        assertTrue(expected.contains(fizzBuzzService.giveString(input)));
    }
}
