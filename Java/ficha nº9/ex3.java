import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a altura do retângulo: ");
        int altura = Integer.parseInt(scan.nextLine());

        System.out.print("Insira a largura do retângulo: ");
        int largura = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == largura-1) {
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
