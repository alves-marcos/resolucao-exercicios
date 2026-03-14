import java.util.Scanner;
import java.util.Locale;

public class ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int X;
        double Y;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextDouble();

        double result = X / Y;

        System.out.printf("%.3f km/l\n", result);
        sc.close();
    }
}
