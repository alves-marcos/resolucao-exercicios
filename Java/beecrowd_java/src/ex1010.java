import java.io.IOException;
import java.util.Scanner;

public class ex1010 {
 
    public static void main(String[] args) throws IOException {
        
        int peca1, numpec1, peca2, numpec2;
        double valor1, valor2, resultado;
        
        Scanner sc = new Scanner(System.in);
        
        peca1 = sc.nextInt();
        numpec1 = sc.nextInt();
        valor1 = sc.nextDouble();
        
        
        peca2= sc.nextInt();
        numpec2 = sc.nextInt();
        valor2 = sc.nextDouble();
        
        resultado = ((numpec1 * valor1) + (numpec2 * valor2));
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);
        
        
        
        sc.close();
    }
 
}