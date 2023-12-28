import java.util.Scanner;

public class PD4_10 {
    public static void main(String[] args) {
        Scanner scanNumbers1 = new Scanner(System.in);
        System.out.println("Puodeliu, kuriuos reikia supakuoti, skaicius: ");
        int kiekis = scanNumbers1.nextInt();
        int kiekisDezeje = 3;

        int deziuKiekis = kiekis / kiekisDezeje;
        System.out.println("Pilnu dezuciu skaicius:" + " " + deziuKiekis);

        int likutis = kiekis - (deziuKiekis * 3);
        System.out.println("Nesupakuotu puodeliu skaicius:" + " " + likutis);
    }
}
