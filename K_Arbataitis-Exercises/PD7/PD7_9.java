/**
 * Parašykite Java metodą, kuris rūšiuoja pateiktos eilutės simbolius abėcėlės tvarka.
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_9 {
    public static void main(String[] args) {
        String text = "The last man stand";
        System.out.println(sortedChars(text));
    }
    public static String sortedChars(String text){
        char[] charArray = text.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray); //cheat
    }
}
