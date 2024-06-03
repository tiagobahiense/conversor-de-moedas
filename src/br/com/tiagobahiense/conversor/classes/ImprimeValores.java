package br.com.tiagobahiense.conversor.classes;

import java.io.IOException;

public class ImprimeValores {

    public static void imprimir(double valorEntrada, String baseCode, String tagetCode ) throws IOException, InterruptedException {
        System.out.println("O valor de "
                + Localizacao.localizando(baseCode, valorEntrada).valorFormatado()
                +" (" + Localizacao.localizando(baseCode, 0).nomeMoeda() + ") convertido é "
                + Localizacao.localizando(tagetCode,
                        Api.inciaApi(baseCode,
                                tagetCode,
                                valorEntrada)).
                valorFormatado()
                +" (" + Localizacao.localizando(tagetCode, 0).nomeMoeda() +")");
    }
}