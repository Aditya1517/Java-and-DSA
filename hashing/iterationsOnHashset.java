import java.util.*;

public class iterationsOnHashset {
    public static void main(String[] args) {
        HashSet <String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bengaluru");

        Iterator itr = cities.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        for(String city: cities){
            System.out.println(city);
        }
    }
}
