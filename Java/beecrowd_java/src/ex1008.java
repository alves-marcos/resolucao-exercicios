import java.io.IOException;
import java.util.Scanner;

public class ex1008 {
 
    public static void main(String[] args) throws IOException {
         
        int number, horas;
        double salary, resultado; 
        
        Scanner sc = new Scanner(System.in);
        
        number = sc.nextInt();
        horas = sc.nextInt();
        salary = sc.nextDouble();
        
        resultado = horas * salary;
        
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n", resultado);
        
        sc.close();
    }
 
}