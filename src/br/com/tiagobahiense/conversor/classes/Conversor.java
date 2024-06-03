package br.com.tiagobahiense.conversor.classes;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Conversor {

    public static void convertedados(Scanner entrada, Menu menu) throws IOException, InterruptedException {
        String baseCode;
        String tagetCode;
        String nomeMoedaOrigem ;
        String nomeMoedaDestino ;


        Interface.mostraMenu();
        do{
            baseCode = CodePais.codigo("Selecione a moeda inicial (ou 0 para sair):", entrada);
            nomeMoedaOrigem = Localizacao.localizando(baseCode, 0).nomeMoeda();

            tagetCode = CodePais.codigo("Selecione a moeda final (ou 0 para sair):", entrada);
            nomeMoedaDestino =Localizacao.localizando(tagetCode, 0).nomeMoeda();
            if (baseCode.equals(tagetCode)){
                System.out.println("Voce selecionou a mesma moeda inicial e moeda final");
            }
        }while (baseCode.equals(tagetCode));


        ImprimeValores.imprimir(ObterValor.valor(
                        "converter de " + nomeMoedaOrigem + " para " + nomeMoedaDestino + " (ou 0 para sair):", entrada),
                baseCode, tagetCode);




    }


}