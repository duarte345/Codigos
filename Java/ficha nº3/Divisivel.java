import java.util.Scanner;

public class Divisivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Introduza um inteiro: ");
        n = Integer.parseInt(scan.nextLine());
        if (n % 3==0 && n % 5==0)
            System.out.println("O número " + n + " é divisível por 3 e 5");
        else
            System.out.println("O número " + n + " não é divisível por 3 e 5");
    }
}