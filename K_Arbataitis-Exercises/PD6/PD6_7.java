public class PD6_7 {
    public static void main(String args[]) {
        int mas[] = {11, 12, 13, 24, 5};
        int suma = 0;
        int daugyba = 1;

        for (int i = 0; i < mas.length; i++) {
            suma += mas[i];
            daugyba = daugyba * mas[i];
        }
        System.out.println(suma); 
        System.out.println(daugyba); 
    }
}

