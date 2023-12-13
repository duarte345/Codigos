import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuOption;
        int number;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Ler número");
            System.out.println("2 - Terminar");
            System.out.print("Escolha uma opção: ");
            menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    do {
                        System.out.print("Digite um número entre 0 e 999: ");
                        number = scanner.nextInt();
                    } while (number < 0 || number > 999);

                    
                    System.out.println("Número por extenso: " + numberInWords);
                    break;
                case 2:
                    System.out.println("Programa encerrado. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (menuOption != 2);
    }

}
