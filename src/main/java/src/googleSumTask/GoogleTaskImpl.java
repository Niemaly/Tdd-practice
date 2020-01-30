package src.googleSumTask;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class GoogleTaskImpl {
    public String isThereOrderedSum_BrutalForceSolution(int[] input, int orderedSum) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if ((input[i] + input[j]) == orderedSum)
                    return "YES";
            }
        }
        return "NO";
    }

    public String isThereOrderedSum(int[] input, int orderedSum) {

        try {
            if (Arrays.stream(input).min().getAsInt() >= orderedSum || input.length < 2)
                return "NO";
        }catch (NoSuchElementException e){
            return "NO";
        }
        Arrays.sort(input);

        for (int i : input) {

            if (i>orderedSum){
                return "NO";
            }

            long b = Arrays.stream(input).filter(e -> e == (orderedSum - i) || e == i).boxed().count();
            if (b > 1)
                return "YES";
        }
        return "NO";
    }
}
