
import java.util.Scanner;


public class ex1013 {



    public static void main(String[] args) {


        int A,B,C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A >= B && A >= C){
            System.out.println(A +" eh o maior");
        } else if (B >= A && B >= C)
        {
            System.out.println(B +" eh o maior");
        } else {
            System.out.println(C +" eh o maior");

        }

    }
}
