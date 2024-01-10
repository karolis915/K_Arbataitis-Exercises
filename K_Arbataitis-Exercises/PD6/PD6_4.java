/**
 * Parašykite programą, kuri randa kiek kartu pasikartoja pasirinktas masyvo elementas.
 */

package lt.techin.pd6;

public class PD6_4 {
    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 3, 3, 4, -3, 5, 3, -10};
        int targetNumber = 3;

        int occurrenceCounter = 0;
        for (int element : originalArray) {
            if (element == targetNumber) {
                occurrenceCounter++;
            }
        }
        System.out.println(occurrenceCounter);
    }
}
