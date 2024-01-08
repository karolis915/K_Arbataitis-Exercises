import java.util.Arrays;

public class PD6_14 {
    public static void main(String[] args) {
    int[] masyv1 = {10, 9, 1, 7, 6};
    int[] masyv2 = {100, 9, 10, 70, 6};
        Arrays.sort(masyv1);
        Arrays.sort(masyv2);
        int bendras = 0;

         for (int i = 0; i < masyv1.length; i++) {
            for (int j = 0; j < masyv2.length; j++) {
                if (masyv1[i] == masyv2[j])
                    bendras++;
                }
            }
                    System.out.println("Masyvas turi bendru demenu - " + bendras);
                }
            }





