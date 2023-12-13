import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
        int raio;
        double PI = 3.14, area;
        System.out.print("Coloque o raio: ");
        raio=Integer.parseInt(scan.nextLine());
        area=PI*(raio*raio);
        System.out.println("A área do círculo é "+area);
    }
}
