public class towerOfHanoi {
    public static void hanoiTower(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("Shift disc "+n+" from "+source+" to "+destination);
            return;
        }

        //transfer top n-1 from src to helper usingdest as 'helper'
        hanoiTower(n-1, source, destination, helper);
        //transfer nth from src to destination
        System.out.println("Shift disc "+n+" from "+source+" to "+helper);
        //transfer n-1 from helper to dest using srcas 'helper'
        hanoiTower(n-1, helper, source, destination);


    }
    public static void main(String args[]){
        int n = 5;
        hanoiTower(n,"A","B","C");
    }
}
