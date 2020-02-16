package src.asseco;

import java.util.*;

public class PlaneSeatsTask {
    public static void main(String[] args) {
        PlaneSeatsTask main2 = new PlaneSeatsTask();

        System.out.println(main2.solution(2,  "1A 2F 1C"));

    }

    public int solution(int N, String S) {

        if (S.length()==0){
            return N*2;
        }

        String array [] = S.split(" ");

        int intArrays [][] = new int[10][N];
        List<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'));


        for (String s : array){
            if (list.contains(s.charAt(s.length()-1))){
                intArrays[list.indexOf(s.charAt(s.length()-1))][Integer.valueOf(s.substring(0,s.length()-1))-1] = 1;
            }

        }
        int counterTotal = 0;
        int counterFam = 0;
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < 10; j++) {

                if (intArrays[j][i]==0){
                    counterFam++;

                }
                if (intArrays[j][i]==1){
                    counterFam=0;
                }

                if (counterFam==5){
                    counterFam=0;
                    counterTotal++;
                //    System.out.println("counterFam = " + counterFam + "  counter total =" + counterTotal + " intArray["+j+"]["+i+"]" );
                }

              // System.out.print(intArrays[j][i]);
            }
            counterFam=0;
         //   System.out.println(" ");
        }

        return counterTotal;
    }
}
