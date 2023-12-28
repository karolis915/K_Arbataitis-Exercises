import java.util.Scanner;

public class PD4_8 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra pirmadieni ");
        int p = scanNumbers1.nextInt();

        Scanner scanNumbers2 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra antradieni ");
        int a = scanNumbers2.nextInt();

        Scanner scanNumbers3 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra treciadieni ");
        int t = scanNumbers3.nextInt();

        Scanner scanNumbers4 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra ketvirtadieni ");
        int k = scanNumbers4.nextInt();

        Scanner scanNumbers5 = new Scanner(System.in);
        System.out.println("Kiek paskaitu yra penktadieni ");
        int pnk = scanNumbers5.nextInt();

        double savaite = p + a + t + k + pnk;
        System.out.println("Paskaitu skaicius per savaite -" + " " + savaite);

        double minutes = savaite * 45;
        System.out.println("Tai sudaro" + " " + minutes + " " + "minuciu");

    }
}
