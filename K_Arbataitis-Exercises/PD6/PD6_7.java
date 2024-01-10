/**
 * Parašykite programą sveikųjų skaičių masyvo sumai ir sandaugai apskaičiuoti.
 */

package lt.techin.pd6;

public class PD6_7 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 4, -3, 5, 3, -10};
        int sum = 0;
        int mulptiplication = 1;


        for (int element : numbers) {
            sum += element;
            mulptiplication *= element;
        }
        System.out.println("sum: " + sum);
        System.out.println("multiplication: " + mulptiplication);
    }
}
