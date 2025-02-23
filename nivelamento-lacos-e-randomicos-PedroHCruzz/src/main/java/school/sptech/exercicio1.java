package school.sptech;
import java.util.Random;
public class exercicio1 {
    public static void main(String[] args) {
        Integer numeroEscolhido = Integer.valueOf(7);
        Random random = new Random();
        Integer tentativas = Integer.valueOf(0);
        Integer numeroSorteado;
        do {
            numeroSorteado = Integer.valueOf(random.nextInt(11));
            tentativas++;
            System.out.println("Número sorteado: " + numeroSorteado);
        } while (!numeroSorteado.equals(numeroEscolhido));

        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
