package src;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {

        List<Object> filteredList = new ArrayList<>();

        for (Object o : list) {
            if (o instanceof Integer) {
                filteredList.add(o);
            }
        }
        return filteredList;
    }
}
