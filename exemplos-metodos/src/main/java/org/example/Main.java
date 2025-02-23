package org.example;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Auxiliar aux = new Auxiliar();
        aux.exibirMensagem("Bom dia");
        aux.exibirMensagem("Boa tarde");
        aux.exibirMensagem("Boa noite");

    }

    Integer somar(Integer a, Integer b) {
        return a + b;
    }
    // Integer soma1 = aux.somar(10, 6);


    // Crie um método chamado calcularMedia
    // que recebe 3 notas e retorna a média


    Double calcularMedia(Double nota1, Double nota2, Double nota3) {
        return (nota1 + nota2 + nota3) / 3;

        // String.format("%.2f", media)
    }

    Double calcularMedia2(Double nota1, Double nota2, Double nota3, Double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;


    }
}







