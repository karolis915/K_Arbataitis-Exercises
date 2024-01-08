public class PD6_1 {
    public static void main(String[] args) {

        int [] array = {9, 13, 30};
        int[] copiedArray = new int[3];

        for (int i = 0; i < array.length; ++i) {
            array = copiedArray;
        }

        System.out.println(copiedArray);
    }
}  
