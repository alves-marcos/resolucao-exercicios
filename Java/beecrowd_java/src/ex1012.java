import java.util.Scanner;

public class ex1012 {
    public static void main(String[] args) {
        double A,B,C;
        double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaTriangulo = (A * C)/2;
        double areaCirculo = (PI * (Math.pow(C,2)));
        double areaTrapezio = ((A + B) * C)/2;
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);


        sc.close();
    }
}
