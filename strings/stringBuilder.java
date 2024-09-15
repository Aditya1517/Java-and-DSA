// string builders are used to reduce time and space complexity of code 
// we can not do this by strings coz they are immutable i.e they can not be changed everytime new string is crated in memorey

package strings;

public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch<'z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
