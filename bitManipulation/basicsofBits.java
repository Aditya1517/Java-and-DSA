package bitManipulation;

public class basicsofBits {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }
    }

    public static void setIthBit(int n, int i) {
        int bitMask = 1 << i;
        System.out.println(n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        System.out.println(n | bitMask);
    }

    public static void clearLastIBit(int n, int i) {
        int bitMask = ~(0 << i);
        System.out.println(n & bitMask);
    }

    public static void clearRangeOfBits(int n, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        System.out.println(n & bitMask);
    }

    public static void isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println("Number is power of two");
        } else {
            System.out.println("Number is not power of two");
        }
    }

    public static void setBitCount(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Number of setBits:- " + count);
    }

    public static void main(String args[]) {
        oddOrEven(3);
        getIthBit(10, 2);
        setIthBit(10, 2);
        clearIthBit(10, 1);
        updateIthBit(10, 2, 1);
        clearIthBit(15, 2);
        clearRangeOfBits(10, 2, 4);
        isPowerOfTwo(16);
        setBitCount(10);
    }
}
