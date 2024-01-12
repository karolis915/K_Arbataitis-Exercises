/**
 * Parašykite Java metodą, kuris konvertuoja Celsijaus laipsnius į Farenheitą.
 */

package lt.techin.pd7;

public class PD7_2 {
    public static void main(String[] args) {
        System.out.println(convertCelToFarreinheit(15.6));
    }
    public static double convertCelToFarreinheit(double temperature){
        return (temperature * 1.8) + 32;
    }
}
