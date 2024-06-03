package br.com.tiagobahiense.conversor.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CodePais {
    public static String codigo(String mensagem , Scanner entrada) {
        String code;
        int opcao = -1;
        do {
            try {
                System.out.println(mensagem);
                opcao = entrada.nextInt();

                if (opcao == 0) {
                    System.out.println("Programa finalizado");
                    System.exit(0);
                } else if (opcao >= 1 && opcao <= 10) {
                    code = Interface.menuEscolha(opcao);
                    System.out.println("Voce selecionou "+ Localizacao.localizando(code, 0).nomeMoeda());
                    return code;
                } else {
                    System.out.println("Opção inválida! Por favor, selecione uma opção de 1 a 10 ou 0 para sair.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro. ");
                entrada.next();
            }
        } while (!(opcao >= 1 && opcao <= 10));
        return null;
    }
}