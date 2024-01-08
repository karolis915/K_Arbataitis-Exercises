public class PD6_12 {
    public static void main(String[] args) {
        int[] masyv = {10, -31, 3, 87, -78, 6, -100, -9};
        int neigiamasSkaitliukas = 0;

        for(int i = 0; i < masyv.length; i++){
            if(masyv[i] < 0){
                neigiamasSkaitliukas++;
            }

        }
        System.out.println("Turime " + neigiamasSkaitliukas + " neigiamu skaiciu");

    }
}

