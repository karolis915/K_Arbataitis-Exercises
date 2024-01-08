import java.lang.reflect.Array;
import java.util.Arrays;

public class PD6_4 {
    public static void main(String[] args) {

        int[] masyv = {10, 9, 10, 7, 6, 6};
        System.out.println("Dublikatai yra: ");
        int count = 0;
        for (int i = 0; i < masyv.length; i++) {
            
            if (masyv[0] != masyv[i])
             
                    continue;
                    count++;

                }
              System.out.println("Elementas : " + masyv[0] + " pasikartoja " + count );
            }

        }









