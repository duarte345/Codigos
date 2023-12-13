import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Introduza um inteiro: ");
        a = Integer.parseInt(scan.nextLine());
        System.out.print("Introduza outro inteiro: ");
        b = Integer.parseInt(scan.nextLine());
        if (a > b)
            System.out.println("O número " + a + " é maior que " + b);
        else if (a < b)
            System.out.println("O número " + b + " é maior que " + a);
        else
            System.out.println("O número " + a + " é igual a " + b);
    }
}