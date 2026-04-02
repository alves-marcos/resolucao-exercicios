import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("================================");

        for(int i=0;i<3;i++) {

            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);

        }

        System.out.println("================================");

        sc.close();

    }

}

/*
* NA PARTE DE IMPRESSÃO ESSAS SÃO AS CONDICÇÕES USADAS PARA IMPRIMIR CORRETAMENTE COM ESOAÇAMENTO SOLICITADO
*
* %-15s → string alinhada à esquerda com largura de 15 caracteres
* %03d → inteiro com 3 dígitos, preenchido com zero
* \n → quebra de linha
*
* */