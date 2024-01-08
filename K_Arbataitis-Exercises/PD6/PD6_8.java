import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PD6_8 {
    public static void main(String[] args) {
        int[] masyv = {10, 20, 10, 30, 40};
        System.out.println("Masyvas be dublikatu: ");
       
        ArrayList<Integer> withoutDuplications = new ArrayList<>();
        for (int i = 0; i < masyv.length; i++) {

                if (!withoutDuplications.contains(masyv[i])) {
                    withoutDuplications.add(masyv[i]);
                }
            }
            System.out.println(withoutDuplications);
        }
    }






