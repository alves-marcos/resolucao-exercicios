import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();



        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int resultado = a;
            int bonus = b;
            for (int j = 0; j< n; j++){
                resultado = resultado + bonus;
                System.out.print(resultado +  " ");
                bonus *= 2;
            }
            System.out.println();

        }

        in.close();
    }
}
