package src;

public class YouOnlyNeedOne {

    public static void main(String[] args) {
        System.out.println(check(new Object[] {66, 101}, 66));
        System.out.println(check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }
    public static boolean check (Object[] arrayOfObjects, Object x){

        for (Object object : arrayOfObjects) {
            if (object.equals(x)){
                return true;
            }
        }
        return false;
    }

}
