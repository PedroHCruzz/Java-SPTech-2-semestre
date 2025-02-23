package school.sptech;

public class exercicio7 {
    public static void main(String[] args) {
        for (Double valor = Double.valueOf(0.15); valor < 5; valor += 0.15) {
            System.out.println(String.format("%.2f", valor));
        }
    }
}
