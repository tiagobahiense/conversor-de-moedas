package br.com.tiagobahiense.conversor.classes;

public class Interface {
    public static String menuEscolha(int opcao) {
        switch (opcao) {
            case 1:
                return "BRL";
            case 2:
                return "USD";
            case 3:
                return "EUR";
            case 4:
                return "GBP";
            case 5:
                return "JPY";
            case 6:
                return "AUD";
            case 7:
                return "CHF";
            case 8:
                return "CAD";
            case 9:
                return "CNY";
            case 10:
                return "ARS";
            default:
                throw new IllegalArgumentException("Opção inválida! Por favor, selecione uma opção de 1 a 10.");
        }
    }

    public static void mostraMenu() {
        System.out.println("""
                1 - Real Brasileiro (BRL)
                2 - Dólar Americano (USD)
                3 - Euro (EUR)
                4 - Libra esterlina (GBP)
                5 - Iene (JPY)
                6 - Dólar Australiano (AUD)
                7 - Franco Suíço (CHF)
                8 - Dólar Canadense (CAD)
                9 - Renminbi (Yuan) (CNY)
                10 - Peso Argentino (ARS)
                """);
    }
}
