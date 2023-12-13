import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o terceiro valor inteiro: ");
        int valor3 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o quarto valor inteiro: ");
        int valor4 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o quinto valor inteiro: ");
        int valor5 = Integer.parseInt(scan.nextLine());

        int maior = valor1;

        if (valor2 > maior) {
            maior = valor2;
        }

        if (valor3 > maior) {
            maior = valor3;
        }

        if (valor4 > maior) {
            maior = valor4;
        }

        if (valor5 > maior) {
            maior = valor5;
        }

        System.out.println("O maior valor é: " + maior);
    }
}
