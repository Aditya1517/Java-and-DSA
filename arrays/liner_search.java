import java.util.*;

public class liner_search {

    public static int int_search(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int str_search(String number[],String key){
        for(int i=0;i<number.length;i++){
            if(number[i].equalsIgnoreCase(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a key which you want to find");
        // int key = sc.nextInt();
        // int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        // int index=int_search(numbers,key);
        // if(index==-1){
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("Key found at index "+index);
        // }

        String foodItems[] = {"Pizza", "Burger", "Pasta", "Sushi", "Salad", "Steak", "Tacos", "Ice Cream", "Fried Chicken", "Samosa", "Soup", "Fish", "Chips"};
        System.out.println("Enter a food item which you want find:");
        String key = sc.nextLine();
        int index = str_search(foodItems, key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index "+index);
        }
        sc.close();
    }
}
