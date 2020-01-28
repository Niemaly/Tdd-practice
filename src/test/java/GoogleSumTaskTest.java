import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.googleSumTask.GoogleTaskImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSumTaskTest {

    // for given array with integers check is there two elements that give ordered sum

    static Stream<Arguments> argumentsStream() {

        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 9}, 8,  "NO"),
                Arguments.of(new int[]{1, 2, 4, 4}, 8,  "YES"),
                Arguments.of(new int[]{1}, 8,  "NO"),
                Arguments.of(new int[]{1,1}, 2,  "YES"),
                Arguments.of(new int[]{1100,1000}, 8,  "NO"),
                Arguments.of(new int[]{}, 8,  "NO")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "argumentsStream")
    void firstTest(int[] input, int orderedSum, String expectedString){

        GoogleTaskImpl googleTaskImpl = new GoogleTaskImpl();

        assertTrue(googleTaskImpl.isThereOrderedSum_BrutalForceSolution(input, orderedSum).equals(expectedString));
        assertTrue(googleTaskImpl.isThereOrderedSum(input, orderedSum).equals(expectedString));

    }


}
