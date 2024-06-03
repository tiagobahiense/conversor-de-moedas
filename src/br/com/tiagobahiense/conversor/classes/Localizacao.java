package br.com.tiagobahiense.conversor.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class Localizacao {

    public static Moeda localizando(String code, double valor) {
        String lingua = "";
        String pais = "";
        String moeda = "";
        switch (code) {
            case "BRL":
                lingua = "pt";
                pais = "BR";
                moeda = "Real Brasileiro";
                break;
            case "USD":
                lingua = "en";
                pais = "US";
                moeda = "Dólar Americano";
                break;
            case "EUR":
                lingua = "de";
                pais = "DE";
                moeda = "Euro";
                break;
            case "GBP":
                lingua = "en";
                pais = "GB";
                moeda = "Libra esterlina";
                break;
            case "JPY":
                lingua = "ja";
                pais = "JP";
                moeda = "Iene";
                break;
            case "AUD":
                lingua = "en";
                pais = "AU";
                moeda = "Dólar Australiano";
                break;
            case "CHF":
                lingua = "fr";
                pais = "CH";
                moeda = "Franco Suíço";
                break;
            case "CAD":
                lingua = "en";
                pais = "CA";
                moeda = "Dólar Canadense";
                break;
            case "CNY":
                lingua = "sh";
                pais = "CN";
                moeda = "Renminbi / Yuan";
                break;
            case "ARS":
                lingua = "es";
                pais = "AR";
                moeda = "Peso Argentino";
                break;
        }
        Locale locale = new Locale(lingua, pais);
        String valorFormatado = NumberFormat.getCurrencyInstance(locale).format(valor);
        return new Moeda(moeda, valorFormatado);
    }


}