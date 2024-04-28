package edu.dio.desafio.contador;

import java.util.Scanner;


class ParametrosInvalidosException extends Exception {


    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class ContadorPrograma {
    public static void main(String[] args) {


        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {

            exception.printStackTrace();
        }



    }

    static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException  {

        if (parametro1 > parametro2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contador = parametro2 - parametro1;

        for (int i=1; i<=contador; i++) {


            System.out.println("Imprimindo o número " + i);


        }.




    }


    }



