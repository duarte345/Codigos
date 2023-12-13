import java.util.Scanner;
import java.io.*;
import java.nio. charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex {
  static String[] disciplinas = new String[3];
  static String[] alunos = new String[40];
  static double[][] notas = new double[40][3];
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int q=1;
    String[] nomes = new String[40];
    int op_inicio=0;
    String nome_utilizador, filecontent, file_name="", write_name;
    File file = new File("Nomes.txt");
    try{
      BufferedWriter nomeFile = new BufferedWriter(new FileWriter(file, true));
      nomeFile.write("sftdsfg");
    }  catch(Exception E) {
      
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("Bem-vindo ao Sistema de Gestão Escolar");
    do {
      do{
        try{
          System.out.print("\nSelecione uma opção:\n1 - Iniciar Sessão\n2 - Registar\n3 - Sair\n\n-> ");
          op_inicio = Integer.parseInt(scan.nextLine());
        }catch (Exception e){
          clearConsole();
          ClearScreenExample3();
        }
      }while(op_inicio<=1 && op_inicio>=3);
      switch (op_inicio) {
        case 1:
          System.out.print("Nome de utilizador: ");
          nome_utilizador = scan.nextLine();
          boolean existe=false;
          String nome="";
          try {
            filecontent = readFile("Nomes.txt", StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(new FileReader("nomes.txt"));
            String line = reader.readLine();
            
            
            while (line != null) {
              if(nome_utilizador.equals(line)==true){
                existe=true;
                nome=nome_utilizador;
              }
              line = reader.readLine();
            }

            reader.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
          if(existe==true){
            System.out.println("Bem-vindo "+nome);
          }
          else{
            System.out.println("O nome de utilizador que introduziu não foi encontrado");
            break;
          }
          int opcao = 0;
          while (opcao != 6) {
            System.out.print("\n\nMenu:\n\n1 - Definir Disciplinas\n2 - Inscrição de Alunos\n3 - Registo de Notas\n4 - Apresentação de Dados Estatísticos\n5 - Apresentação dos dados dos alunos\n6 - Terminar Sessão\n\n-> ");
            opcao = Integer.parseInt(input.nextLine());
              switch (opcao) {
                case 1:
                  definirDisciplinas();
                break;
                case 2:
                  q=inscreverAluno();
                break;
                case 3:
                  registarNotas(q);
                break;
                case 4:
                  apresentarDadosEstatisticos(q);
                break;
                case 5:
                  apresentarDadosAlunos();
                break;
                case 6:
                  System.out.println("Terminou Sessão");
                break;
                default:
                    System.out.println("Opção inválida!");
              }
            }
        break;
        case 2:
          System.out.print("Qual é o seu nome de utilizador: ");
          write_name = scan.nextLine();
          boolean existe2=false;
          try {
            FileReader fileReader = new FileReader("Nomes.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
              if(linha.equals(write_name)){
                existe2=true;
              }
            }
            if (existe2==true){
              System.out.println("O nome já existe");
            } else {
              System.out.println("O seu nome de utilizador foi registado");
              BufferedWriter nomeFile = new BufferedWriter(new FileWriter(file, true));
              nomeFile.write("\n"+write_name);
              nomeFile.close();
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        break;
        case 3:
          System.exit(0);
          
        break;
        default:
          System.out.println("Opção Errada");
        break;
      }
    }while (op_inicio != 3);
    scan.close();
  }

  static String readFile(String path, Charset encoding)
      throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, encoding);
      }
  
  private static void definirDisciplinas() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduza o nome da disciplina " + (i + 1) + ": ");
            disciplinas[i] = input.nextLine();
        }
  }
  private static int inscreverAluno() {
    
    System.out.print("Introduza o número de alunos que quer inserir: ");
    String str=input.nextLine();
    int q = Integer.parseInt(str);
    if (q >= 1 && q <= 40) {
      for (int n=1; n <= q; n++){
        System.out.print("Introduza o nome do aluno: ");
        alunos[n - 1] = input.nextLine();
      }
    } else {
      System.out.println("Número de aluno inválido!");
    }
    return q;
  }
  private static void registarNotas(int q) {
    if (q >= 1 && q <= 40) {
      for (int i = 0; i < q; i++) {
        System.out.print("Aluno "+alunos[i]+"\n");
        for (int j=0; j<3;j++){
          do{
            System.out.print("Introduza a nota de " + disciplinas[j] +": ");
            notas[i][j] = Double.parseDouble(input.nextLine());
            if (notas[i][j]<0 || notas[i][j]>20){
              System.out.println("Número Inválido. Tente Novamente.");
            }
          }while(notas[i][j]<0 || notas[i][j]>20);
        }
      }
    } else {
      System.out.println("Número de aluno inválido!");
    }
  }
  private static void apresentarDadosEstatisticos(int q) {
        double[] negativas = new double[3];
        double[] positivas = new double[3];
        double[] media = new double[3];

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                if (notas[i][j] < 10) {
                    negativas[j]++;
                } else {
                    positivas[j]++;
                }
            }
        }
        double soma=0;
        for (int i = 0; i < 3; i++) {
          soma=0;
          for(int j=0; j<q; j++){
            soma=soma+notas[j][i];
            
          }
          media[i] = soma / q;
        }

        System.out.println("\nDados estatísticos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Disciplina " + disciplinas[i] + ":");
            System.out.println("Número de notas negativas: " + negativas[i]);
            System.out.println("Número de notas positivas: " + positivas[i]);
            System.out.println("Média: " + media[i]);
        }
  }
  private static void apresentarDadosAlunos() {
    for (int i = 0; i < 40; i++) {
      if (alunos[i] != null) {
        System.out.println("Nº do aluno: " + (i + 1) + "\nNome: " + alunos[i] + "\nNotas:\n"+disciplinas[0]+" : "+ notas[i][0]+"\n"+disciplinas[1]+" : " + notas[i][1] + "\n"+disciplinas[2]+" : " + notas[i][2]);
      }
    }
  }
  public final static void clearConsole() {  
    try{  
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")){
        Runtime.getRuntime().exec("cls");
      } else {
        Runtime.getRuntime().exec("clear");
      }
    }catch (final Exception e){  
      e.printStackTrace();
    }
  }
  private class ClearScreenExample3{  
    private static void main(String... arg) throws IOException, InterruptedException{  
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
    } 
  } 
} 