package strings;

public class stringCompression {
    public static String compressedString(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1; // Initialize count for each character

            // Count occurrences of consecutive characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append character and its count if greater than 1
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbcccdd";
        System.out.println("Compressed string is: " + compressedString(str));
    }
}


// time complexity : O(n) thoe here 2 loops are used but the loop is going to the to n times only for one 