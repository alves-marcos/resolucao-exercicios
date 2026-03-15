import java.util.Locale;
import java.util.Scanner;

public class ex1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double valor;

        Scanner sc = new Scanner(System.in);
        valor = sc.nextDouble();
        System.out.println("NOTAS:");

        double valor100 = valor / 100;
        System.out.println((int)valor100 + " nota(s) de R$ 100.00");
        double resto100 = valor % 100;

        double valor50 = resto100 / 50;
        System.out.println((int)valor50 + " nota(s) de R$ 50.00");
        double resto50 = resto100 % 50;

        double valor20 = resto50 / 20;
        System.out.println((int)valor20 + " nota(s) de R$ 20.00");
        double resto20 = resto50 % 20;

        double valor10 = resto20 / 10;
        System.out.println((int)valor10 + " nota(s) de R$ 10.00");
        double resto10 = resto20 % 10;

        double valor5 = resto10 / 5;
        System.out.println((int)valor5 + " nota(s) de R$ 5.00");
        double resto5 = resto10 % 5;

        double valor2 = resto5 / 2;
        System.out.println((int)valor2 + " nota(s) de R$ 2.00");
        double resto2 = resto5 % 2;
        resto2 = Math.round(resto2 * 100.0) / 100.0;

        System.out.println("MOEDAS:");

        double moeda1 = resto2 / 1;
        System.out.println((int)moeda1 + " moeda(s) de R$ 1.00");
        double restoMoeda1 = resto2 % 1;

        double moeda050 = restoMoeda1 / 0.50;
        System.out.println((int)moeda050 + " moeda(s) de R$ 0.50");
        double resto050 = restoMoeda1 % 0.50;

        double moeda025 = resto050 / 0.25;
        System.out.println((int)moeda025 + " moeda(s) de R$ 0.25");
        double resto025 = resto050 % 0.25;

        double moeda010 = resto025 / 0.10;
        System.out.println((int)moeda010 + " moeda(s) de R$ 0.10");
        double resto010 = resto025 % 0.10;

        double moeda005 = resto010 / 0.05;
        System.out.println((int)moeda005 + " moeda(s) de R$ 0.05");
        double resto005 = resto010 % 0.05;

        double moeda001 = resto005 / 0.01;
        System.out.println((int)moeda001 + " moeda(s) de R$ 0.01");


        sc.close();
    }
}
