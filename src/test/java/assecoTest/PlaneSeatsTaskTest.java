package assecoTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import src.asseco.PlaneSeatsTask;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlaneSeatsTaskTest {

    static Stream<Arguments> planeSeatsSchedule(){

        return Stream.of(
          Arguments.of(2,  "1A 2F 1C", 2),
          Arguments.of(4, "", 8)
        );
    }

    @ParameterizedTest
    @MethodSource("planeSeatsSchedule")
    void testSchedule(int numberOfRows, String seatsTaken, int output){

        PlaneSeatsTask planeSeatsTask = new PlaneSeatsTask();

        assertTrue(planeSeatsTask.solution(numberOfRows, seatsTaken)==output);


    }



}
