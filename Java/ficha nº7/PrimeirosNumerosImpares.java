import java.util.Scanner;

public class PrimeirosNumerosImpares {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;
        
        System.out.println("Os primeiros 10 números ímpares são:");
        do {
            System.out.println(numero);
            contador++;
            numero += 2;
        } while (contador < 10);
    }
}
