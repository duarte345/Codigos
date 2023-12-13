import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor ímpar: ");
        int valor = scanner.nextInt();
        
        if (valor % 2 == 0) {
            System.out.println("Por favor, insira um valor ímpar.");
            return;
        }
        
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= valor; j++) {
                if (i == j || i + j == valor + 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
