package src.fizzBuzz;

public class Buzz implements Elements {
    public Buzz() {
    }
    @Override
    public boolean isaBoolean(int input) {
        return input % 5 == 0;
    }

    @Override
    public String getString(int input) {
            return "Buzz";
    }


}