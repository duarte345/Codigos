import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2, maior;
        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = Integer.parseInt(scan.nextLine());

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = Integer.parseInt(scan.nextLine());
        if (numero1>numero2){
            maior = numero1;
            System.out.println("O maior número é: "+maior);
        }
        else if (numero1<numero2) {
            maior=numero2;
            System.out.println("O maior número é: "+maior);
        } else{
            System.out.println("Os dois 2 números são iguais");
        }
    }
}