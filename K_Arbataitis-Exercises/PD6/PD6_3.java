import java.util.Arrays;

public class PD6_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] newarray = new int[6];

        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        System.out.println(Arrays.toString(newarray));
    }
}




