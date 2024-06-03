package br.com.tiagobahiense.conversor.classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    private static final String apiKey =  "93fc60a56664ef288aeab38d";



    public static double inciaApi(String baseCode, String tagetCode, Double valorEntrada) throws InterruptedException, IOException {



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCode + "/" + tagetCode + "/" + valorEntrada))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ApiRec apiRec = gson.fromJson(response.body(), ApiRec.class);
        return Double.parseDouble(apiRec.conversion_result());
    }

}