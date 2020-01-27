package src.fizzBuzz;

public class Shizz implements Elements {
    public Shizz() {
    }

    @Override
    public boolean isaBoolean(int input) {
        return input % 13 == 0;
    }

    @Override
    public String getString(int input) {return "Shizz";
    }

}
