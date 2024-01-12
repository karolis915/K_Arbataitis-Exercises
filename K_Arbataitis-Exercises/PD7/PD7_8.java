/**
 * Parašykite Java metodą, kuris patikrina ar teksto eilutė yra palindromas, ar ne?
 */

package lt.techin.pd7;

public class PD7_8 {
    public static void main(String[] args) {
        String text = "ANna";
        System.out.println(isPalindrom(text));
    }

    public static boolean isPalindrom(String text) {
        text = text.toLowerCase();
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;

            }

        }
        return true;
    }
}
