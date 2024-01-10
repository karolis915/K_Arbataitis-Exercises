/**
 * Parašykite programą, kuri sujungia du masyvus ir pašalina visus pasikartojančius elementus.
 */

package lt.techin.pd6;

import java.util.Arrays;

public class PD6_10 {
    public static void main(String[] args) {
        int[] numberArr1 = {1, 2, 3, 4, 5};
        int[] numberArr2 = {3, 4, 5, 6, 7, 8};
        int[] sujungtasMasyvas = new int[numberArr1.length + numberArr2.length];
        int index = 0;
        for (int elArr1 : numberArr1) {
            sujungtasMasyvas[index++] = elArr1;
        }
        for (int elArr2 : numberArr2) {
            sujungtasMasyvas[index++] = elArr2;
        }
        System.out.println(Arrays.toString(sujungtasMasyvas));
        //TODO ->> PD6_8
    }
}
