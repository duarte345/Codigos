import java.util.Scanner;

public class DetectaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a largura da figura: ");
        int largura = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o comprimento da figura: ");
        int comprimento = Integer.parseInt(scan.nextLine());

        if (largura == comprimento) {
            System.out.println("A figura é um quadrado.");
        } else {
            System.out.println("A figura é um retângulo.");
        }
    }
}
