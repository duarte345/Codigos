public class ContagemRegressiva {
    public static void main(String[] args) {
        int numero = 10;

        System.out.println("Contagem regressiva:");

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);

        System.out.println("Lançamento!");
    }
}
