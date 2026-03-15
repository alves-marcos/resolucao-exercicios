import java.util.Scanner;

public class ex1019 {
    public static void main(String[] args) {

        int tempo;
        Scanner sc = new Scanner(System.in);

        tempo = sc.nextInt();

        int resultadoHora = tempo / 3600;
        int restoHora = tempo % 3600;

        int resultadoMinuto = restoHora / 60;
        int segundos = restoHora % 60;

        System.out.println(resultadoHora + ":" + resultadoMinuto + ":" + segundos);

        sc.close();
    }
}
