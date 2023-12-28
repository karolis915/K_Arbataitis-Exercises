import java.util.Scanner;

public class PD5_6 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.println("Kiek egluciu atvezta? ");
        String egluciuSk = scannner.nextLine();

        int skaicius = Integer.parseInt(egluciuSk);
        double sum = 0;
        int test = 0;
        do {
            test += 1;
            System.out.println("Iveskite"+" "+ test +" "+"eglutes auksti:" );
            String egluciuAukstis = scannner.nextLine();
            double aukstis = Double.valueOf(egluciuAukstis);
            sum += aukstis;
        }
        while (test != skaicius);

        double vidurkis = sum / skaicius;
        System.out.println("Eglutes aukscio vidurkis:" + " " + vidurkis);
    }
}
