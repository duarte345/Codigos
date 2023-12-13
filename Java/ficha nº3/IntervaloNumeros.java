import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Introduza um inteiro: ");
        n = Integer.parseInt(scan.nextLine());
        if (n > 10 && n < 20)
            System.out.println("O número " + n + " está entre 10 e 20");
        else
            System.out.println("O número " + n + " não está entre 10 e 20");
    }
}