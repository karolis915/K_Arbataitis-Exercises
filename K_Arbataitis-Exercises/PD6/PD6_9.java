import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PD6_9 {

            public static void main(String[] args) {
            String[] masyv = {"80", "70", "Labas", "HelloWorls", "37"};

            List sarasas = Arrays.asList(masyv);

            Collections.shuffle(sarasas);
            sarasas.toArray(masyv);

            System.out.println(Arrays.toString(masyv));


        }
    }

