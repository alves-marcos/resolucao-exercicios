import java.util.Scanner;

public class ex1049 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String op1 = sc.nextLine();
        String op2 = sc.nextLine();
        String op3 = sc.nextLine();

        if (op1.equals("vertebrado") && op2.equals("ave") && op3.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (op1.equals("vertebrado") && op2.equals("ave") && op3.equals("onivoro")) {
            System.out.println("pomba");
        } else if (op1.equals("vertebrado") && op2.equals("mamifero") && op3.equals("onivoro")) {
            System.out.println("homem");
        } else if (op1.equals("vertebrado") && op2.equals("mamifero") && op3.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (op1.equals("invertebrado") && op2.equals("inseto") && op3.equals("hematofago")) {
            System.out.println("pulga");
        } else if (op1.equals("invertebrado") && op2.equals("inseto") && op3.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (op1.equals("invertebrado") && op2.equals("anelideo") && op3.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (op1.equals("invertebrado") && op2.equals("anelideo") && op3.equals("onivoro")) {
            System.out.println("minhoca");
        }


        sc.close();
    }
}
