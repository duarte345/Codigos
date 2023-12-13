import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Simulador de Poker!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Jogar");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Digite o número de jogadores: ");
                int numPlayers = scanner.nextInt();
                playPoker(numPlayers);
            } else if (choice == 2) {
                System.out.println("Até logo!");
                break;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }

    public static void playPoker(int numPlayers) {
        ArrayList<String> deck = createDeck();
        shuffleDeck(deck);

        ArrayList<ArrayList<String>> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new ArrayList<>());
        }

        // Distribui 2 cartas para cada jogador
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numPlayers; j++) {
                String card = deck.remove(0);
                players.get(j).add(card);
            }
        }

        // Coloca 3 cartas abertas na mesa
        System.out.println("\nCartas na mesa:");
        for (int i = 0; i < 3; i++) {
            String card = deck.remove(0);
            System.out.println("Carta " + (i + 1) + ": " + card);
        }
    }

    public static ArrayList<String> createDeck() {
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"Espadas", "Copas", "Ouros", "Paus"};
        String[] ranks = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " de " + suit);
            }
        }
        return deck;
    }

    public static void shuffleDeck(ArrayList<String> deck) {
        Random random = new Random();
        for (int i = 0; i < deck.size(); i++) {
            int j = random.nextInt(deck.size());
            String temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }
}
