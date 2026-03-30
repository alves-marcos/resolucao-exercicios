import java.util.Locale;
import java.util.Scanner;

public class ex1040 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

        System.out.printf("Media: %.1f\n", Math.floor(media * 10) / 10);

        if(media > 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            double mediaRecalculado = (media + notaExame) / 2;
            if(mediaRecalculado >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",  mediaRecalculado);
            } else {
                System.out.println("Aluno reprovado.");
            }
        }


        sc.close();

    }
}
