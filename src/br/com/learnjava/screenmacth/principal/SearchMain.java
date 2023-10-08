package br.com.learnjava.screenmacth.principal;

import br.com.learnjava.screenmacth.execptions.ErroNoAnoException;
import br.com.learnjava.screenmacth.modelos.Pesquisando;
import br.com.learnjava.screenmacth.modelos.Titulo;
import br.com.learnjava.screenmacth.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Pesquisando search = new Pesquisando();
        String busca;
        List<Titulo> titulos = new ArrayList<>();

        while (true) {
            System.out.println("Digite \"sair\" para sair");
            System.out.println("Digite o filme para busca");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String json = search.Busca(busca);
                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);

               // System.out.println("\n" + meuTituloOmdb);

                Titulo vamo = new Titulo(meuTituloOmdb);
                System.out.println(vamo);

                //titulos.add(vamo);
                System.out.println("O programa foi executado corretamente\n");

            } catch (NumberFormatException e) {
                System.out.println("\nAconteceu um erro: " + e.getMessage());
                System.out.println("O programa foi executado com erro");

            } catch (ErroNoAnoException e) {
                System.out.println(e.getMessage());
            }

           // System.out.println(titulos);
        }


    }
}



