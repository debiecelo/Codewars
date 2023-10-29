package src;

public class BinaryAddtion {
    public static void main(String[] args) {
        System.out.println(binaryAddition(1,1));
        System.out.println(binaryAddition(1,2));
        System.out.println(binaryAddition(2,2));

    }

    public static String binaryAddition(int a, int b){
        int sum = a+b;
        return  Integer.toBinaryString(sum);
    }
}
