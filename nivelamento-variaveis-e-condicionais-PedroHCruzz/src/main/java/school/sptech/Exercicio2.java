package school.sptech;
public class Exercicio2 {
    public static void main(String[] args) {
        Integer tempoAquecimento = Integer.valueOf(10);
        Integer tempoAerobico = Integer.valueOf(20);
        Integer tempoMusculacao = Integer.valueOf(15);
        Integer caloriasAquecimento = Integer.valueOf(12);
        Integer caloriasAerobico = Integer.valueOf(20);
        Integer caloriasMusculacao = Integer.valueOf(25);
        Integer totalCalorias = (tempoAquecimento * caloriasAquecimento) +
                (tempoAerobico * caloriasAerobico) +
                (tempoMusculacao * caloriasMusculacao);
        Integer totalMinutos = tempoAquecimento + tempoAerobico + tempoMusculacao;
        System.out.println("Olá, Jorge. Você fez um total de " + totalMinutos + " minutos de exercícios e perdeu cerca de " + totalCalorias + " calorias.");
    }
}
