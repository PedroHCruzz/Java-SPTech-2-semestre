package org.example;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        System.out.println("digite a segunda nota: ");
        System.out.println("digite a terceira nota: ");

        Double nota1 = leitor.nextDouble();
        Double nota2 = leitor.nextDouble();
        Double nota3 = leitor.nextDouble();

        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);

        System.out.println("digite o Nome do usuario");
        String nome  = leitor.nextLine();

        Double invalido;

        do {
            System.out.println("digite a primeira nota: ");
            nota1 = leitor.nextDouble();
            invalido = nota1 < 0 || nota1 > 10;
            if (invalido) {
                System.out.println("valor invalido");
            }
        } while (nota1 < 0 || nota1 > 10);


        }


    }

