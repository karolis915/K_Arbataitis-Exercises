import java.util.Scanner;

public class PD5_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek dalyvauja begiku : ");
        int runquantity = scanner.nextInt();
        int number =0; 
        double min = 0;
        double n = 0;

        for (int i = 1; i <= runquantity; i++) {
            number+=1;
            System.out.println("Iveskite " + number + " begiko laikus sek :"); 
            double runTime = scanner.nextDouble();
            if (min == 0) {
                min = runTime;

            } else if (min > runTime) {
                min = runTime;
            }
            n += runTime; 
        }
            double nAvg = n / runquantity; 
            System.out.println("Greiciausio begiko laikas " + min + " greitesnis uz priesininka " + (nAvg -min));
    }
}









