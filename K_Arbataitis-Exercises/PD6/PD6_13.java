import com.sun.source.tree.BinaryTree;
import java.util.Arrays;

public class PD6_13 {
    public static void main(String[] args) {
        int[] masyv1 = {10, 9, 10, 7, 6};
        int[] masyv2 = {100, 90, 100, 70, 6};
        int masyv1Ilgis = masyv1.length;
        int masyv2Ilgis = masyv2.length;

        Arrays.sort(masyv1);
        Arrays.sort(masyv2);
        int bendras = 0;
        if (masyv1Ilgis == masyv2Ilgis) {
            for (int i = 0; i < masyv1Ilgis; i++) {
                if (masyv1[i] == masyv2[i])

                        System.out.println("Masyvo ilgis vienodas ");
                    }
                    }else {
            System.out.println("Masyvo ilgis NEVIENODAS ");
                }
            }
        }


