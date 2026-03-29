import java.util.Locale;
import java.util.Scanner;

public class ex1036 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = Math.pow(B, 2) - (4 * A * C);
        double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
        double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", raiz1);
            System.out.printf("R2 = %.5f%n", raiz2);
        }
        sc.close();
    }
}
