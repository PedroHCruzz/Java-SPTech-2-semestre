package school.sptech;
import java.util.Random;
public class exercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer numeroEscolhido = Integer.valueOf(random.nextInt(100) + 1);
        Integer primeiraOcorrencia = null;
        Integer pares = Integer.valueOf(0);
        Integer impares = Integer.valueOf(0);

        for (Integer i = Integer.valueOf(1); i <= 200; i++) {
            Integer numeroSorteado = Integer.valueOf(random.nextInt(100) + 1);
            if (numeroSorteado.equals(numeroEscolhido) && primeiraOcorrencia == null) {
                primeiraOcorrencia = i;
            }
            if (numeroSorteado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Número escolhido: " + numeroEscolhido);
        System.out.println("O número foi sorteado pela primeira vez na posição: " +
                (primeiraOcorrencia != null ? primeiraOcorrencia : "Não foi sorteado"));
        System.out.println("Quantidade de números pares sorteados: " + pares);
        System.out.println("Quantidade de números ímpares sorteados: " + impares);
    }
}
