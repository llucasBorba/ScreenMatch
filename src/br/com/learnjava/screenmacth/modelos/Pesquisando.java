package br.com.learnjava.screenmacth.modelos;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pesquisando {

    public String Busca(String busca) throws IOException, InterruptedException {


        var endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=8796ddcc";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        return json;

    }

}
