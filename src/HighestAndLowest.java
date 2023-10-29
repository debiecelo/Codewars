package src;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    private static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        int size = split.length;
            int [] array = new int [size];
            for (int i = 0; i < size; i++){
                array[i] = Integer.parseInt(split[i]);
            }

        int[] ints = Arrays.stream(array).sorted().toArray();
        String maximum = String.valueOf(ints[size-1]);
        String minimum = String.valueOf(ints[0]);
        return maximum + " " + minimum;

    }
}
