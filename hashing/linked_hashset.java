import java.util.*;

public class linked_hashset {
    public static void main(String[] args) {
         HashSet <String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bengaluru");

        System.out.println(cities);

        LinkedHashSet <String> lhs = new LinkedHashSet<>();

        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Bengaluru");

        System.out.println(lhs);


    }
}
