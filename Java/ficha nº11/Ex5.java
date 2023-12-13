import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int opcao;
        do{
            int nLanc=300;
            Scanner scan = new Scanner(System.in);
            System.out.print("Bem-vindo ao lançador de dados\n\nSelecione uma opção:\n1 - Lançar 1 dado\n2 - Lançar 2 dados\n3 - Sair\n\n-> ");
            opcao=Integer.parseInt(scan.nextLine());
            switch (opcao){
                case 1:
                    System.out.print("Quantas vezes pretende lançar o dado?\n-> ");
                    nLanc=Integer.parseInt(scan.nextLine());
                    int[] dado = new int[7];
                    int max=0;
                    float percent=0;
                    for(int i=0; i<nLanc; i++){
                        int d1= (int)(Math.random()*6)+1;
                        dado[d1]++;
                    }
                    for(int i=1; i<=6; i++){ 
                        if(dado[i]>max){
                            max=dado[i];
                        }
                    }
                    for(int i=1; i<=6; i++){
                        System.out.print(""+i+" : ");
                            for(int j=0; j<dado[i]*110/max; j++){
                                percent=dado[i]*100f/nLanc;
                                System.out.print("X");
                            }
                            System.out.printf(" (%d - %.1f%%)%n", dado[i], percent);
                    }
                break;
                case 2:
                    System.out.print("Quantas vezes pretende lançar o dado?\n-> ");
                    nLanc=Integer.parseInt(scan.nextLine());
                    int[] dado2 = new int[13];
                    max=0;
                    percent=0;
                    for(int i=0; i<nLanc; i++){
                        int d1= (int)(Math.random()*6)+1;
                        int d2= (int)(Math.random()*6)+1;
                        dado2[d1+d2]++;
                    }
                    for(int i=2; i<=12; i++){ 
                        if(dado2[i]>max){
                            max=dado2[i];
                        }
                    }
                    for(int i=2; i<=12; i++){
                        if (i<10) System.out.print(" "); 
                        System.out.print(""+i+" : ");
                            for(int j=0; j<dado2[i]*100/max; j++){
                                percent=dado2[i]*100f/nLanc;
                                System.out.print("X");
                            }
                            System.out.printf(" (%d - %.1f%%)%n", dado2[i], percent);
                    }
                break;
                case 3:
                    System.exit(0);
                break;
                default:
                    System.out.println("\nOpção Inválida!\nTente novamente!");
                break;
            }
        }while(opcao!=3);
        //scan.close();
    }     
}  