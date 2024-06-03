package br.com.tiagobahiense.conversor.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObterValor {

    public static double valor(String mensagem, Scanner entrada) {
        double valor;

        do {
            try {
                System.out.println("Digite o valor que deseja " + mensagem);
                valor = entrada.nextDouble();
                if (valor == 0) {
                    System.out.println("Deseja sair?");
                    System.exit(0);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um valor válido. ");
                entrada.next();
            }
        } while (true);

        return valor;
    }
}
