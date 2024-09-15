public class convertNumToText {
    public static void conToNum(int number){
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(number == 0){
            return;
        }

        int lastDigit = number%10;
        conToNum(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String args[]){
        conToNum(1230);
    }
}
