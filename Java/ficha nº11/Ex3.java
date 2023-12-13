import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vals = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vals[i] = Integer.parseInt(scan.nextLine());
        }
        int maior = vals[0];
        int menor = vals[0];
        for (int i = 1; i < 5; i++) {
            if (vals[i] > maior) {
                maior = vals[i];
            }
            if (vals[i] < menor) {
                menor = vals[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (vals[i] != maior && vals[i] != menor) {
                System.out.println("Valor: " + vals[i]);
            }
        }
    }
}
