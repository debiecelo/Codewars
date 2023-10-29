package src;

public class TotalPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {

        int sum = 0;
        for (String game : games) {

            char x = game.charAt(0);
            char y = game.charAt(2);
            sum+= x > y ? 3 : x == y?1 : 0;
        }
        return sum;
    }
}
