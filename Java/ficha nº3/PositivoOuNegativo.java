import java.util.Scanner;
public class PositivoOuNegativo {
    public static void main (String[] args){
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        num=Integer.parseInt(scan.next());
        if (num>0)
            System.out.println("O número "+num+" é positivo");
        else if (num<0)
            System.out.println("O número "+num+" é negativo");
        else
            System.out.println("O número "+num+" é 0");
    }
}