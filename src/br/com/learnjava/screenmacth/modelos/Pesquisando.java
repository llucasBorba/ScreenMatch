package br.com.learnjava.screenmacth.modelos;

import br.com.learnjava.screenmacth.execptions.ErroNoAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

public class Pesquisando {

    public String Busca(String busca) throws IOException, InterruptedException {


        var endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=8796ddcc";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println("\n" + json);

        return json;

    }

}
