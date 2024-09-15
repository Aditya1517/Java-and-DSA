package ArrayList;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;;

public class basics {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); // this how we define arraylist of Intiger type 

        // adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println(list);

        // to fetch elemnt from list we use get method :- and enter index there

        int element = list.get(2);
        System.out.println(element);

        // delete :- pass index there

        list.remove(3);
        System.out.println(list);

        // to set element at index :- pass index and its value

        list.set(3, 6);
        System.out.println(list);

        // to check if the element is in the list or not

        boolean a = list.contains(5);
        System.out.println(a);

        // size 
        System.out.println(list.size());

        // to sort an arryaList
        Collections.sort(list);  // ascendeing order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
    }
}
