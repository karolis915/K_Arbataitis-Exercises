/**
 * Sukurkite klasę / objektą kuris moka generuoti atsitiktinių skaičių masyvą. Masyvo dydis yra
 * pateikiamas kaip argumentas.
 */

package lt.techin.pd8;

import java.util.Arrays;

public class PD8_1 {
    public static void main(String[] args) {
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
        int[] myRandomNumbers = randomArrayGenerator.generateRandom(50);
        System.out.println(Arrays.toString(myRandomNumbers));
    }
}
