/**
 * Parašykite programą, kuri randą mažiausią ir didžiausią skaičių integer tipo masyve.
 */

package lt.techin.pd6;

public class PD6_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 4, -3, 5, 3, -10, 133};
        int min = numbers[0];
        int max = numbers[0];

        for (
                int element : numbers) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
