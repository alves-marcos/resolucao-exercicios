import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bR.readLine().trim());

        for (int i = 0; i < 10; i++){
            int resul = N * (i + 1);
            System.out.println(N + " x " + (i + 1) + " = " + resul);
        }


        bR.close();
    }
}
