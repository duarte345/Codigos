import java.util.Scanner;
import java.io.*;
import java.util.*;

public class casos {
    static String[] disciplinas = new String[3];
    static String[][] alunos = new String[40][3];
    static String[][] notas = new String[40][3];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 6) {
            System.out.print("\n\nSistema de Gestão Escolar\n\n1 - Definir Disciplinas\n2 - Inscrição de Alunos\n3 - Registo de Notas\n4 - Apresentação de Dados Estatísticos\n5 - Apresentação dos dados dos alunos\n6 - Terminar Programa\n\n-> ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    definirDisciplinas();
                    break;
                case 2:
                    inscreverAluno();
                    break;
                case 3:
                    registarNotas();
                    break;
                case 4:
                    apresentarDadosEstatisticos();
                    break;
                case 5:
                    apresentarDadosAlunos();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void definirDisciplinas() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduza o nome da disciplina " + (i + 1) + ":");
            disciplinas[i] = input.next();
        }
    }

    private static void inscreverAluno() {
        System.out.print("Introduza o número do aluno (entre 1 e 40):");
        int n = input.nextInt();
        if (n >= 1 && n <= 40) {
            System.out.print("Introduza o nome do aluno:");
            alunos[n - 1][0] = input.next();
        } else {
            System.out.println("Número de aluno inválido!");
        }
    }

    private static void registarNotas() {
        System.out.print("Introduza o número de alunos que deseja inserir (entre 1 e 40):");
        int n = input.nextInt();
        if (n >= 1 && n <= 40) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Introduza a nota de " + disciplinas[i] + " do aluno " + alunos[n - 1][0] + ":");
                notas[n - 1][i] = input.next();
            }
        } else {
            System.out.println("Número de aluno inválido!");
        }
    }

    private static void apresentarDadosEstatisticos() {
        
    }

    private static void apresentarDadosAlunos() {
        for (int i = 0; i < 40; i++) {
            if (alunos[i][0] != null) {
                System.out.println("Nº do aluno: " + (i + 1) + " Nome: " + alunos[i][0] + " Notas: " + notas[i][0] + ", " + notas[i][1] + ", " + notas[i][2]);
            }
        }
    }
}