import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ex1042 {
    public  static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int vect[] = new int[3];

        for (int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        int original[] = Arrays.copyOf(vect, vect.length);

        Arrays.sort(vect);

        for (int j = 0; j < vect.length; j++){
            System.out.println(vect[j]);
        }

        System.out.println();

        for (int x = 0; x < original.length; x++){
            System.out.println(original[x]);
        }

        sc.close();
    }
}
