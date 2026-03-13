import java.util.Scanner;

public class ex1011 {
    public static void main(String[] args) {

        double PI = 3.14159;
        double result;
        int raio;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextInt();

        result = (4.0/ 3) * PI * (Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f\n", result);


        sc.close();
    }
}