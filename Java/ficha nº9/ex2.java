import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a altura do retângulo: ");
        int altura = Integer.parseInt(scan.nextLine());

        System.out.print("Insira a largura do retângulo: ");
        int largura = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
