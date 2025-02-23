package school.sptech;
public class Exercicio1 {
    public static void main(String[] args) {
        Integer filhos0a3 = Integer.valueOf(2);
        Integer filhos4a16 = Integer.valueOf(3);
        Integer filhos17a18 = Integer.valueOf(1);
        Double valor0a3 = Double.valueOf(25.12);
        Double valor4a16 = Double.valueOf(15.88);
        Double valor17a18 = Double.valueOf(12.44);
        Double totalBolsa = (filhos0a3 * valor0a3) + (filhos4a16 * valor4a16) + (filhos17a18 * valor17a18);
        Integer totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;

        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa.%n", totalFilhos, totalBolsa);
    }
}
