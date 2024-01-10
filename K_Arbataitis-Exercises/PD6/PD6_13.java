/**
 * Parašykite programą, kuri patikrina ar du masyvai yra vienodi (negalima naudoti metodo equals()).
 */

package lt.techin.pd6;

public class PD6_13 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};

        boolean areEqual = true;
                if(numbers1.length != numbers2.length){
                    areEqual = false;

                } else {
                    for (int i = 0; i < numbers1.length; i++) {
                        if (numbers1[i] != numbers2[i]){
                            areEqual = false;
                            break;
                        }

                    }
                }
        System.out.println(areEqual);
    }
}
