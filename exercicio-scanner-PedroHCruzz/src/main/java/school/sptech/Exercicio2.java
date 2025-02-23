package school.sptech;
import java.util.Scanner;
import java.util.Random;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Integer numero;
        do {
            System.out.print("Digite um número entre 0 e 100: ");
            numero = Integer.parseInt(scanner.nextLine());
        } while (numero < 0 || numero > 100);

        Integer sorteios = 0;
        Integer primeiraOcorrencia = null;

        for (int i = 1; i <= 200; i++) {
            Integer sorteado = random.nextInt(101); 
            sorteios++;

            if (sorteado.equals(numero) && primeiraOcorrencia == null) {
                primeiraOcorrencia = sorteios;
            }
        }

        if (primeiraOcorrencia != null) {
            System.out.println("O número " + numero + " foi sorteado pela primeira vez no sorteio número " + primeiraOcorrencia + ".");

            if (primeiraOcorrencia < 10) {
                System.out.println("Você é MUITO sortudo");
            } else if (primeiraOcorrencia <= 50) {
                System.out.println("Você é bem sortudo");
            } else {
                System.out.println("Melhor parar de apostar e ir trabalhar hein....");
            }
        } else {
            System.out.println("O número " + numero + " não foi sorteado nas 200 tentativas.");
        }

        scanner.close();
    }

}
