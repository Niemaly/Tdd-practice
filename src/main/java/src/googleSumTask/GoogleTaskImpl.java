package src.googleSumTask;

import java.util.Arrays;

public class GoogleTaskImpl {
    public String isThereOrderedSum(int[] input, int orderedSum) {
        //Brutal Force


        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j <input.length ; j++) {
                if ((input[i]+input[j])==orderedSum)
                    return "YES";
            }
        }
        return "NO";
    }
}
