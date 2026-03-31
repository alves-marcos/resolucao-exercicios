import java.util.Locale;
import java.util.Scanner;

public class ex1048 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double salary = sc.nextDouble();

        double newSalary = 0;
        double reajueste = 0;
        if (salary >= 0 && salary <= 400.00) {
            reajueste = salary * 0.15;
            newSalary = reajueste + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", reajueste);
            System.out.println("Em percentual: 15 %");
        } else if (salary >= 400.01 && salary <= 800.00) {
            reajueste = salary * 0.12;
            newSalary = reajueste + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", reajueste);
            System.out.println("Em percentual: 12 %");
        } else if (salary >= 800.01 && salary <= 1200.00) {
            reajueste = salary * 0.10;
            newSalary = reajueste + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", reajueste);
            System.out.println("Em percentual: 10 %");
        } else if (salary >= 1200.01 && salary <= 2000.00) {
            reajueste = salary * 0.07;
            newSalary = reajueste + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", reajueste);
            System.out.println("Em percentual: 7 %");
        } else if (salary >= 2000.00) {
            reajueste = salary * 0.04;
            newSalary = reajueste + salary;
            System.out.printf("Novo salario: %.2f\n", newSalary);
            System.out.printf("Reajuste ganho: %.2f\n", reajueste);
            System.out.println("Em percentual: 4 %");
        }

        sc.close();
    }
}
