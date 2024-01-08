import java.util.Scanner;

public class PD5_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite kuro bako talpa: ");
        int bakoTalpa = scanner.nextInt();

        System.out.print("Iveskite kuro sanaudas l: ");
        int kuroSanaudos = scanner.nextInt();

        int likutis = bakoTalpa;  
        int dienos = 0;  
        while (likutis >= 0) {

            likutis -= (dienos % 2 == 0) ? kuroSanaudos  : kuroSanaudos*2; 
            dienos++;
        }
        System.out.println("Keliauti bus galima " + (dienos) + " dienas.");
    }
}


