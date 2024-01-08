import java.util.ArrayList;
import java.util.Arrays;

public class PD6_10 {
    public static void main(String[] args) {
        int[] masyv1 = {10, 9, 10, 7, 6};
        int[] masyv2 = {100, 90, 10, 70, 6};
        int masyv1Ilgis = masyv1.length;
        int masyv2Ilgis = masyv2.length;

        int[] sumMasyv = new int[masyv1Ilgis + masyv2Ilgis];

        System.arraycopy(masyv1, 0, sumMasyv, 0, masyv1Ilgis);
        System.arraycopy(masyv2, 0, sumMasyv, masyv1Ilgis, masyv2Ilgis); 
        Arrays.sort(sumMasyv); 
        
        ArrayList<Integer> withoutDuplications = new ArrayList<>();
        for (int i = 0; i < sumMasyv.length; i++) {
            
            if (!withoutDuplications.contains(sumMasyv[i])) {
                withoutDuplications.add(sumMasyv[i]);
            }
        }
        System.out.println(withoutDuplications);
    }
}

