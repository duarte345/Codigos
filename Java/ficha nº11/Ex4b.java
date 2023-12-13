public class Ex4b {
    public static void main(String[] args) {
        int[] frequencia = new int[7];

        for (int i = 0; i < 100; i++) {
            int roll = (int) (Math.random() * 6) + 1;
            frequencia[roll]++;
        }
        System.out.println("Resultados do lançamento do dado (100 vezes):");
        for (int num = 1; num <= 6; num++) {
            String bar = "X".repeat(frequencia[num]);
            System.out.printf("%d - %s (%d)%n", num, bar, frequencia[num]);
        }
    }
}
