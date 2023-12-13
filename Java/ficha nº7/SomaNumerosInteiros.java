import java.util.Scanner;

public class SomaNumerosInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Insira um número inteiro positivo ou 0 para sair: ");
            numero = scan.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números introduzidos é: " + soma);
    }
}
