
import java.io.IOException;
import java.util.Scanner;

public class ex1006 {

	public static void main(String[] args) throws IOException {

		double A, B, PROD;

		Scanner sc = new Scanner(System.in);

		A = sc.nextDouble();
		B = sc.nextDouble();

		PROD = (((A * 3.5) + (B * 7.5)) / 11);

		System.out.printf("MEDIA = %.5f\n", PROD);

		sc.close();
	}

}
