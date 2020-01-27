package src.fizzBuzz;

public class Fizz implements Elements {
    public Fizz() {
    }
    @Override
    public boolean isaBoolean(int input) {
        return input % 3 == 0;
    }

    @Override
    public String getString(int input) {return "Fizz";
    }


}