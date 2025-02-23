package school.sptech;
import java.util.Scanner;
public class Exercicio1 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite o nome do aluno: ");
      String nomeAluno = scanner.nextLine();

      System.out.print("Digite a quantidade de provas realizadas: ");
      Integer quantidadeProvas = Integer.parseInt(scanner.nextLine());

      Double somaNotas = 0.0;

      for (int i = 1; i <= quantidadeProvas; i++) {
        System.out.print("Digite a nota da prova " + i + ": ");
        Double nota = Double.parseDouble(scanner.nextLine());
        somaNotas += nota;
      }

      Double media = somaNotas / quantidadeProvas;

      System.out.printf("\nAluno: %s\nMédia: %.2f\n", nomeAluno, media);

      scanner.close();
    }
  }
