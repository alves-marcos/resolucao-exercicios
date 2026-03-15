import java.util.Scanner;

public class ex1018 {

    public static void main(String[] args) {

        int valor;
        Scanner sc = new Scanner(System.in);

        valor = sc.nextInt();

        System.out.println(valor);
        int resultado100 = valor / 100;
        System.out.println(resultado100 + " nota(s) de R$ 100,00");
        int resultadoResto100 = valor % 100;

        int resultado50 =  resultadoResto100 / 50;
        System.out.println(resultado50 + " nota(s) de R$ 50,00");
        int resultadoResto50 = resultadoResto100 % 50;

        int resultado20 = resultadoResto50 / 20;
        System.out.println(resultado20 + " nota(s) de R$ 20,00");
        int resultadoResto20 = resultadoResto50 % 20;

        int resultado10 = resultadoResto20 / 10;
        System.out.println(resultado10 + " nota(s) de R$ 10,00");
        int resultadoResto10 = resultadoResto20 % 10;

        int resultado5 = resultadoResto10 / 5;
        System.out.println(resultado5 + " nota(s) de R$ 5,00");
        int resultadoResto5 = resultadoResto10 % 5;

        int resultado2 = resultadoResto5 / 2;
        System.out.println(resultado2 + " nota(s) de R$ 2,00");
        int resultadoResto2 = resultadoResto5 % 2;

        int resultado1 = resultadoResto2 / 1;
        System.out.println(resultado1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
