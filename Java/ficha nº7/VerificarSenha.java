import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senhaCorreta = 1234;
        int tentativas = 3;

        do {
            System.out.print("Insira a senha (4 dígitos): ");
            int senhaDigitada = scan.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso concedido!");
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Acesso negado");
                }
            }
        } while (tentativas > 0);
    }
}
