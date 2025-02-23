package school.sptech;
public class Exercicio3 {
    public static void main(String[] args) {
        Double valorUnitario = Double.valueOf(15.75);
        Integer quantidadeVendida = Integer.valueOf(3);
        Double valorPago = Double.valueOf(50.00);
        Double valorTotal = valorUnitario * quantidadeVendida;
        Double troco = valorPago - valorTotal;
        System.out.println("Seu troco será de R$ " + String.format("%.2f", troco));
    }
}
