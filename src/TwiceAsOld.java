package src;

public class TwiceAsOld {
    public static void main(String[] args) {
        System.out.println(twiceAsOld(45,30));
    }
    public static int twiceAsOld(int dadYears, int sonYears){

        return Math.abs(dadYears - (sonYears)*2);

    }
}
