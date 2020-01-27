package src.fizzBuzz;

public class NumberToString implements Elements {
    public NumberToString() {
    }

    @Override
    public boolean isaBoolean(int input) {
        return true;
    }

    @Override
    public String getString(int input) {
        return Integer.toString(input);
    }
}
