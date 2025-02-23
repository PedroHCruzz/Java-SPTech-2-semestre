package school.sptech;
import java.util.Random;
public class exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer numeroSorteado;
        Integer soma = Integer.valueOf(0);
        do {
            numeroSorteado = Integer.valueOf(random.nextInt(11));
            soma += numeroSorteado;
            System.out.println("Número sorteado: " + numeroSorteado);
        } while (!numeroSorteado.equals(Integer.valueOf(0)));

        System.out.println("A soma dos números é " + soma);
    }
}
