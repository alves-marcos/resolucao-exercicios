import java.io.IOException;
import java.util.Scanner;

public class ex1009 {
 
    public static void main(String[] args) throws IOException {
        
        String name;
        double salary, sale, resultado;
        
        Scanner sc = new Scanner(System.in);
        
        name = sc.next();
        salary = sc.nextDouble();
        sale = sc.nextDouble();
        
        
        resultado = salary + (sale * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f\n",resultado);
        
        
        
        sc.close();
    }
 
}