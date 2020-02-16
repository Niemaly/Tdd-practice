package assecoTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.asseco.MessageCutter;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageCutterTest {

    static Stream<Arguments> cutThisMsg(){
        return Stream.of(
                Arguments.of("The quick brown fox jumps over the lazy dog", 39, "The quick brown fox jumps over the lazy"),
                Arguments.of("Codility the task", 14, "Codility the"),
                Arguments.of("Ala had a dog", 39, "Ala had a dog")
        );
    }


    @ParameterizedTest
    @MethodSource("cutThisMsg")
    void cutMassage(String input, int range, String output){
        MessageCutter messageCutter = new MessageCutter();
        assertTrue(messageCutter.solution(input, range).equals(output));
    }

}
