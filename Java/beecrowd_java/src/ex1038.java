import java.util.Locale;
import java.util.Scanner;

public class ex1038 {
    public static void main(String[] args){

        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torrada = 2.00;
        double refrigerante = 1.50;


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int quant = sc.nextInt();

        switch (item){
            case 1:
                double resultado = cachorroQuente * quant;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 2:
                resultado = xSalada * quant;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 3:
                resultado = xBacon * quant;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 4:
                resultado = torrada * quant;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
            case 5:
                resultado = refrigerante * quant;
                System.out.printf("Total: R$ %.2f%n", resultado);
                break;
        }

        sc.close();
    }
}
