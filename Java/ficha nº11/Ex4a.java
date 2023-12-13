public class Ex4a {

    public static void main(String[] args) {

        int[] frequencia = new int[6];
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random()*6)+1;
            frequencia[x - 1]++;
        }
        System.out.println("Frequências dos números no lançamento do dado:");
        for (int i = 0; i < frequencia.length; i++) {
            System.out.println((i + 1) + ": " + frequencia[i]);
        }
    }
}