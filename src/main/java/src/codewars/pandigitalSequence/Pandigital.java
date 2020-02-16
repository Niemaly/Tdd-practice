package src.codewars.pandigitalSequence;

import java.util.*;

public class Pandigital {


    public static long[] getSequence(final long offset, final int size) {

        long starterPandigital = 1023456789L;
        long newOffset=0;

        if (offset>9876543210L || size == 0) {
            return new long[]{};
        }

        if (offset<starterPandigital) {
            newOffset = starterPandigital;
        } else {
            newOffset = offset;
        }

        String str = String.valueOf(newOffset);
        Stack<Integer> stack = new Stack<>();

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        StringBuilder stringBuilder = new StringBuilder(str);



        for (int i = 0; i<str.length(); i++){
            int number = Integer.valueOf(stringBuilder.charAt(i));

            if (list.stream().min(Integer::compareTo).get() < number){
                System.out.println("minimal val of str "  +list.stream().min(Integer::compareTo).get());
                System.out.println("number  -  " + number);
                stringBuilder.setCharAt(i, Character.highSurrogate(list.stream().min(Integer::compareTo).get().intValue()));
                list.remove(list.stream().min(Integer::compareTo).get());


            }
        }
        System.out.println(stringBuilder.toString());

         return null;

    }

    long createNewSmallestPandigitalNumber(long number){

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        char [] array = String.valueOf(number).toCharArray();

        for (char character : array){
            System.out.println(character);
        }


        return 0;


    }

}
