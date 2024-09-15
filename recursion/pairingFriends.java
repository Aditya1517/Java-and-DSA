// package recursion;

// import oops.staticKeyWord;

// given n friends , each one can remain single or can be paired up with some other friends . Each friend can be paired only once . Find out the total number of ways in which friends can remain single or can be paired up

// company :- goldman sacks

public class pairingFriends {
    public static int friendsPairing(int n){

        if(n==1 || n==2){
            return n;
        }

        // single 
        int fnm1 = friendsPairing(n-1);

        // pair
        int fnm2 = friendsPairing(n-2);
        int pairingWays = (n-1)*fnm2;

        int totalWays = fnm1 + pairingWays;

        return totalWays;
    }
    public static void main(String args[]){

        System.out.println(friendsPairing(5));

    }
    
}
