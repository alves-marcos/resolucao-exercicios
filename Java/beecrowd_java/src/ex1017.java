import java.util.Scanner;
import java.util.Locale;

public class ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double  X , Y;
        Scanner sc = new Scanner(System.in);

        X = sc.nextDouble();
        Y = sc.nextDouble();

        double resultado = (X * Y) /12;

        System.out.printf("%.3f\n", resultado);

        sc.close();
    }
}
