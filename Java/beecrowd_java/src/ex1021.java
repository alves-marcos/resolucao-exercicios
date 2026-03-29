import java.util.Locale;
import java.util.Scanner;

public class ex1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = (int) Math.round(sc.nextDouble() * 100);

        System.out.println("NOTAS:");

        System.out.println(valor / 10000 + " nota(s) de R$ 100.00");
        valor %= 10000;

        System.out.println(valor / 5000 + " nota(s) de R$ 50.00");
        valor %= 5000;

        System.out.println(valor / 2000 + " nota(s) de R$ 20.00");
        valor %= 2000;

        System.out.println(valor / 1000 + " nota(s) de R$ 10.00");
        valor %= 1000;

        System.out.println(valor / 500 + " nota(s) de R$ 5.00");
        valor %= 500;

        System.out.println(valor / 200 + " nota(s) de R$ 2.00");
        valor %= 200;

        System.out.println("MOEDAS:");

        System.out.println(valor / 100 + " moeda(s) de R$ 1.00");
        valor %= 100;

        System.out.println(valor / 50 + " moeda(s) de R$ 0.50");
        valor %= 50;

        System.out.println(valor / 25 + " moeda(s) de R$ 0.25");
        valor %= 25;

        System.out.println(valor / 10 + " moeda(s) de R$ 0.10");
        valor %= 10;

        System.out.println(valor / 5 + " moeda(s) de R$ 0.05");
        valor %= 5;

        System.out.println(valor / 1 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}