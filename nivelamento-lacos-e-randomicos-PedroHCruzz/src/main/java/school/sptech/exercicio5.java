package school.sptech;

public class exercicio5 {
    public static void main(String[] args) {
        Integer base = Integer.valueOf(2);
        Integer expoente = Integer.valueOf(5);
        Integer resultado = Integer.valueOf(1);
        for (Integer i = Integer.valueOf(0); i < expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}
