import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        String nome;
        System.out.print("Introduza o seu nome: ");
        nome = scan.nextLine();
        System.out.print("Introduza a sua Idade: ");
        idade = Integer.parseInt(scan.nextLine());
        System.out.println("O " + nome + " tem " + idade + " anos");
    }
}