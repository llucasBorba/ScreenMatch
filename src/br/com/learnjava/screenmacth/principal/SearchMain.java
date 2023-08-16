package br.com.learnjava.screenmacth.principal;

import br.com.learnjava.screenmacth.modelos.Titulo;
import br.com.learnjava.screenmacth.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite o filme para busca, quando cansar de buscar o filme digite sair: ");
        // String exit = scanner.nextLine();

        // while (!exit.equalsIgnoreCase("sair")) {
        System.out.println("Digite o filme para busca ");

        String busca = scanner.nextLine();

       // String busca;
//        if (input.contains(String.valueOf(' '))) {
//            busca = input.replace(' ', '+');
//        } else {
//            busca = input;
//        }

        var endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=8796ddcc";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("\n" + json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
            System.out.println(meuTituloOmdb);
            // exit = scanner.nextLine();

//        try {
            Titulo search = new Titulo(meuTituloOmdb);
            System.out.println(search);

        System.out.println("O programa foi executado corretamente");


        } catch (NumberFormatException e) {
            System.out.println(" \n Aconteceu um erro: " + e.getMessage());
            System.out.println("O programa foi executado com erro");
        }


    }

}


