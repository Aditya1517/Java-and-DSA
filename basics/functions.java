public class functions {

    // function to convert a binary number to decimal number
    public static void bintodec(int binNun){
        int original_num = binNun;
        int power = 0;
        int decNum = 0;
        while(binNun>0){
            int last_digit = binNun % 10;
            decNum = decNum + (last_digit * (int)Math.pow(2, power));  // here math.pow takes and returns values in double but dont want that so we type casted it in int
            power++;
            binNun = binNun / 10;
        }
        System.out.println("The eqivalent number of " + original_num + " is " +decNum);
    }

    // function to convert a decimal number to binary number
    public static void dectobin(int decNum){
        int original_num = decNum;
        int power = 0;
        int binNun = 0;
        while(decNum>0){
            int rem = decNum %2;
            binNun = binNun + (rem * (int)Math.pow(10, power)); // here also we type casted into int
            power++;
            decNum = decNum /2;
        }
        System.out.println("The equivalent number of "+original_num+" is "+binNun);
    }

    public static void main(String args[]){
        bintodec(111);
        dectobin(7);
    }
}
