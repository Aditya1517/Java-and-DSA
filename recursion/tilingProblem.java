// package recursion;

// import oops.staticKeyWord;

// given a 2xn board and tiles of size 2x1 , count the number of ways to tile given board using 2x1 tiles (A tile can either be placed horizontally or vertically)
// amazon 

public class tilingProblem {

    public static int tilingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical choice
        int fnm1 = tilingproblem(n - 1);

        // Horizontal choice
        int fnm2 = tilingproblem(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        int n = 4; // Example: Test with a 2xn board where n = 5
        int ways = tilingproblem(n);
        System.out.println("Number of ways to tile the board: " + ways);
    }
}
