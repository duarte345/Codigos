import java.util.Scanner;

public class MaiorNumeroLido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE; // Inicializamos com o menor valor possível
        do {
            System.out.print("Insira um número inteiro: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        } while (numero != 0);

        System.out.println("O maior número lido é: " + maior);
    }
}
