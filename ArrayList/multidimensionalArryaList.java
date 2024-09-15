package ArrayList;

import java.util.*;

public class multidimensionalArryaList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(3);
        list.add(4);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> CurrList = mainList.get(i);
            for(int j=0;j<CurrList.size();j++){
                System.out.println(CurrList.get(j)+" ");
            }
        }

    }
}
