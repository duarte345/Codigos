import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeros, estrelas;
        int[] numerosGerados, estrelasGeradas;
        System.out.println("Bem-vindo ao Euromilhões!\n1Escolha uma opção:");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        int opcao = scanner.nextInt();
        if(opcao == 1) {
            System.out.println("Quantos números deseja gerar (entre 1 e 50)?");
            numeros = scanner.nextInt();
            System.out.println("Quantas estrelas deseja gerar (entre 1 e 11)?");
            estrelas = scanner.nextInt();
            if(numeros < 1 || numeros > 50 || estrelas < 1 || estrelas > 11) {
                System.out.println("Valores inválidos.");
            } else {
                numerosGerados = random.ints(1, 51).distinct().limit(numeros).toArray();
                estrelasGeradas = random.ints(1, 12).distinct().limit(estrelas).toArray();
                Arrays.sort(numerosGerados);
                Arrays.sort(estrelasGeradas);
                
                //Exibir os números e estrelas gerados
                System.out.println("Números gerados: " + Arrays.toString(numerosGerados));
                System.out.println("Estrelas geradas: " + Arrays.toString(estrelasGeradas));
            }
            
        } else if(opcao == 2) {
            System.out.println("Obrigado por jogares! Até breve.");
        } else {
            System.out.println("Opção inválida.");
        }
        
    }
}