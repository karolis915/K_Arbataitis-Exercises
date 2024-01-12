/**
 * Parašykite Java metodą, kuris apverčia skaičių (Pvz.: 45 –> 54).
 */

package lt.techin.pd7;

public class PD7_7 {
    public static void main(String[] args) {
        int number = 54; // 50 + 4
        System.out.println(reverseNum(number));
    }
    public static int reverseNum(int number) {
        int reversed = 0;
        while(number !=0){
            int reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number = number / 10;
        }
        return reversed;
    }
}
