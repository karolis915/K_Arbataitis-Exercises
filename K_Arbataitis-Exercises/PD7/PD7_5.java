/**
 * Parašykite Java metodą, kuris skaičiuoja skaičiaus faktorialą.
 */

package lt.techin.pd7;

import java.math.BigInteger;

public class PD7_5 {
    public static void main(String[] args) {
        int number = 120;
        System.out.println(countNumFactorial(number));
    }
    public static BigInteger countNumFactorial(int number){
        if (number < 0){
           return null;
        } else{
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++);
            {
//                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        }

    }
}
