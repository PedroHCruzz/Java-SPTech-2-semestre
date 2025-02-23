package school.sptech;
public class Exercicio4 {
    public static void main(String[] args) {
        String nome = "Carlos";
        Double nota1 = Double.valueOf(8.5);
        Double nota2 = Double.valueOf(9.2);
        Double media = (nota1 + nota2) / 2;
        System.out.println("Olá, " + nome + ". Sua média foi de " + String.format("%.2f", media));
    }
}
