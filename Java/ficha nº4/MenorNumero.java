import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = Integer.parseInt(scan.nextLine());

        if (numero1 < numero2) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero2 < numero1) {
            System.out.println("O menor número é: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
