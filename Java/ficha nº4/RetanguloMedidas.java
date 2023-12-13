import java.util.Scanner;
public class RetanguloMedidas{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
        float largura, comprimento, area, perimetro;
        System.out.print("Insira a largura: ");
        largura=Float.parseFloat(scan.nextLine());
        System.out.print("Insira o comprimento: ");
        comprimento=Float.parseFloat(scan.nextLine());
        perimetro=largura+largura+comprimento+comprimento;
        area=largura*comprimento;
        System.out.println("O perímetro do retângulo é "+perimetro+" cm e a área é "+area+" m2");
    }
}