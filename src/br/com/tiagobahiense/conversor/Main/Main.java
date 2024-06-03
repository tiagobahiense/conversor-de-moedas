package br.com.tiagobahiense.conversor.Main;

import java.awt.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static br.com.tiagobahiense.conversor.classes.Conversor.convertedados;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        Menu menu = new Menu();
        System.out.println("Bem vindo!");
        System.out.println("Selecione 1 para iniciar ou 0 para sair:");

        do {
            try {
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        convertedados(entrada,menu);
                        System.out.println("Deseja fazer uma nova conversão?");
                        System.out.println("1 - Sim  0 - Nao" );
                        break;
                    case 0:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, selecione uma opção válida.");
                        System.out.println("Selecione 1 para reiniciar ou 0 para sair.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro. ");
                entrada.next();
                opcao = -1;
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (opcao != 0);
        System.out.println("Obrigado por usar nosso programa");

        entrada.close();
    }



}