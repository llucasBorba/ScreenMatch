package br.com.learnjava.screenmacth.principal;

import br.com.learnjava.screenmacth.execptions.ErroNoAnoException;
import br.com.learnjava.screenmacth.modelos.Pesquisando;
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

       try {
        String busca = scanner.nextLine();
        Pesquisando search = new Pesquisando();
        String json = search.Busca(busca);
        System.out.println("Json na principal: " + json);


        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);

        System.out.println("\n" + meuTituloOmdb);

            Titulo vamo = new Titulo(meuTituloOmdb);
            System.out.println(vamo);

            System.out.println("O programa foi executado corretamente");

        } catch (NumberFormatException e) {
            System.out.println(" \n Aconteceu um erro: " + e.getMessage());
            System.out.println("O programa foi executado com erro");

        } catch (ErroNoAnoException e) {
            System.out.println(e.getMessage());
        }




    }

}


