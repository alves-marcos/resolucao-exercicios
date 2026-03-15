import java.util.Scanner;

public class ex1020 {

    public static void main(String[] args) {

        int valor;

        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();

        int resultadoAno = valor / 365;
        System.out.println(resultadoAno + " ano(s)");
        int restoResultadoAno = valor % 365;

        int resultadoMes = restoResultadoAno / 30;
        System.out.println(resultadoMes + " mes(es)");
        int restoResultadoMes = restoResultadoAno % 30;

        System.out.println(restoResultadoMes + " dia(s)");


        sc.close();
    }
}
