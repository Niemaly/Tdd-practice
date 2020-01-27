package src.fizzBuzz;

import java.io.IOException;

public class FizzBuzzService {

    // remember that NumberToString allways return true, so add new elements before it.
    Elements[] elements = {new FizzBuzz(), new Shizz(), new Fizz(), new Buzz(), new NumberToString()};


    public String giveString(int input) throws IOException {


        for (Elements element : elements) {
            if (element.isaBoolean(input)) {

                return element.getString(input);

            }
        }

        throw new IOException("msg");

    }


}
