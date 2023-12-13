import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura (valor ímpar): ");
        int largura = scanner.nextInt();

        // Verifica se a largura é ímpar
        if (largura % 2 == 0) {
            System.out.println("A largura deve ser ímpar.");
            return;
        }

        System.out.print("Digite a altura (até à base do telhado): ");
        int altura = scanner.nextInt();

        // Desenha a casa
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("X");
                } else if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
