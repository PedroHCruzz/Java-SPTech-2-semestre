package school.sptech;

public class Exercicio1 {
    public class ExercicioMetodos {

        public static Boolean verificarMaioridade(Integer idade) {
            return idade >= 18;
        }

        public static Double calcularMedia(Double valor1, Double valor2, Double valor3) {
            return (valor1 + valor2 + valor3) / 3;
        }

        public static Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3) {
            Integer maior = valor1;
            if (valor2 > maior) maior = valor2;
            if (valor3 > maior) maior = valor3;
            return maior;
        }

        public static Integer calcularFatorial(Integer valor) {
            Integer fatorial = 1;
            for (Integer i = 1; i <= valor; i++) {
                fatorial *= i;
            }
            return fatorial;
        }

        public static Boolean verificarPrimo(Integer valor) {
            if (valor <= 1) return false;
            for (Integer i = 2; i <= Math.sqrt(valor); i++) {
                if (valor % i == 0) return false;
            }
            return true;
        }

        public static Integer calcularPotencia(Integer base, Integer expoente) {
            Integer resultado = 1;
            for (Integer i = 0; i < expoente; i++) {
                resultado *= base;
            }
            return resultado;
        }

        public static Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido) {
            if (valorRecebido < valorCompra) return 0;
            Double troco = valorRecebido - valorCompra;
            return (int) (troco / 0.25);
        }

        public static void main(String[] args) {
            // Exemplos de uso
            System.out.println("Maioridade: " + verificarMaioridade(20));
            System.out.println("Média: " + calcularMedia(7.5, 8.0, 9.0));
            System.out.println("Maior Número: " + maiorNumero(5, 9, 3));
            System.out.println("Fatorial: " + calcularFatorial(5));
            System.out.println("É Primo: " + verificarPrimo(7));
            System.out.println("Potência: " + calcularPotencia(2, 4));
            System.out.println("Balas com troco: " + calcularTrocoEmBalas(10.0, 20.0));
        }
    }

}
