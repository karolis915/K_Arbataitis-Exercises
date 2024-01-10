/**
 * Parašykite programą, kuri paima skaičių masyvą ir grąžina trečią mažiausią masyvo skaičių.
 */

package lt.techin.pd6;

import java.util.Arrays;

public class PD6_11 {

    public static void main(String[] args) {
        int[] myArray = {9, 4, 10, 99, 11, 2, 87};

        Arrays.sort(myArray);

        System.out.println("Sorted array: " + Arrays.toString(myArray));
        System.out.println("3rd : " + myArray[2]);

    }

}
