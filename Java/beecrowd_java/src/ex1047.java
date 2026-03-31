import java.util.Scanner;

public class ex1047 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int minuInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minuFinal = sc.nextInt();

        // 🔥 converte tudo para minutos
        int inicio = horaInicio * 60 + minuInicio;
        int fim = horaFinal * 60 + minuFinal;

        int duracao;

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 * 60 - inicio) + fim;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }
}
