import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vals = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Valor "+(i+1)+": ");
            vals[i]=Integer.parseInt(scan.nextLine());
        }
        for(int i=0; i<5; i++){
            System.out.println("Valor "+(i+1)+": "+vals[i]);
        }
    }    
}