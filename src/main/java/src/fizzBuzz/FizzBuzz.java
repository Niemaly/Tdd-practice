package src.fizzBuzz;

public class FizzBuzz implements Elements {
    public FizzBuzz() {
    }
    @Override
    public boolean isaBoolean(int input) {
        return new Fizz().isaBoolean(input) && new Buzz().isaBoolean(input);
    }

    @Override
    public String getString(int input) {
        return new Fizz().getString(input) + new Buzz().getString(input);
    }

}