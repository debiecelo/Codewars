package src;

public class BuildPileOfCubes {

    public static void main(String[] args) {
        System.out.println((findNb(4183059834009L)));
        System.out.println((findNb(135440716410000L)));
        System.out.println((findNb(24723578342962L)));
        System.out.println((findNb(1788504763054109410L)));
        System.out.println((findNb(1685140409067235562L)));
        System.out.println((findNb(2211348573765744401L)));
        System.out.println((findNb(1854837376733981026L)));
        System.out.println((findNb(1790165286325242225L)));
        System.out.println((findNb(1628714468024982361L)));
        System.out.println((findNb(1923874732462753225L)));


    }
    public static long findNb(long m) {
        int n = 0;
        long total = 0;
        while(total < m ){
            n +=1;
            total += Math.pow(n,3);

        }

        return total == m? n : -1;


    }
}
