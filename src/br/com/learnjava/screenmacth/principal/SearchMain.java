package br.com.learnjava.screenmacth.principal;

import br.com.learnjava.screenmacth.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o filme para busca: ");
        var busca = leitura.nextLine();

        var endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=8796ddcc";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

         String json = response.body();
        System.out.println("\n" + json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println("Titulo nome: " + meuTitulo.getNome());
    }
}
