import java.util.Scanner;

public class PD4_12 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Kiek zuvu gyvena akvariume? ");
        int zuvuSkaicius = scanNumbers1.nextInt();

        Scanner scanNumbers2 = new Scanner(System.in);
        System.out.println("Kiek zuvu i akvariuma idedama kiekviena diena? ");
        int zuvuPerDiena = scanNumbers2.nextInt();

        Scanner scanNumbers3 = new Scanner(System.in);
        System.out.println("Kiek dienu praejo? ");
        int dienu = scanNumbers3.nextInt();

        int kiekis = zuvuSkaicius + (zuvuPerDiena * zuvuPerDiena);

        System.out.println("Po" + " "+ "dienu akvariume gyvens"+ " " +kiekis+ " " + "zuvu.");
    }
}
