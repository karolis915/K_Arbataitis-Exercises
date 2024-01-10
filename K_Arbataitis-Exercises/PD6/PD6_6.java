/**
 * Parašykite programą, kuri atspausdina pateikto masyvo elementus.
 */

package lt.techin.pd6;

public class PD6_6 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 4, -3, 5, 3, -10, 133};
        // for
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}






