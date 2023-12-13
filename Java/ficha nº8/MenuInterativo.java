import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Interativo:");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("3. Opção 3");
            System.out.println("4. Opção 4");
            System.out.println("5. Terminar");

            System.out.print("Escolha uma opção (1 a 5): ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Escolheu a opção " + opcao);
                    break;
                case 5:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
            }
        } while (opcao != 5);

        scan.close();
    }
}
