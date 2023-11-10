package src;

import java.util.Arrays;

public class ExpandedForm {

    public static void main(String[] args) {
        System.out.println(expandedForm(32504));
        System.out.println(expandedForm(25000));

    }
    public static String expandedForm(int num) {

        String[] integerArray = Integer.toString(num).split("");
        String result;

        for (int i = 0; i < integerArray.length-1; i++) {
            if (Integer.parseInt(integerArray[i]) > 0) {
                for (int j = i; j < integerArray.length - 1; j++) {
                    integerArray[i] += '0';
                }
            }
        }
        result = Arrays.toString(integerArray);
        result = result.substring(1, result.length()-1).replace(", 0", "").replace(",", " +");
        return result;
    }
}
