package br.com.learnjava.screenmacth.principal;

import br.com.learnjava.screenmacth.modelos.Filme;
import br.com.learnjava.screenmacth.modelos.Serie;
import br.com.learnjava.screenmacth.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLIst {
    public static void main(String[] args) {
        var tropa = new Filme("Tropa de Elite", 2100);
        var fightClub = new Filme("Fight Club", 2000);
        var homemAranha = new Filme("Homem Aranha", 2014);
        var lost = new Serie("lost", 1900);
        lost.avalieFilme(9);

        List<Titulo> lista = new ArrayList<>();

        lista.add(homemAranha);
        lista.add(tropa);
        lista.add(fightClub);
        lista.add(lost);
        System.out.println(" \n" + lista);

     /*   for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme)
           System.out.println("A classificação é: " + filme.getClassificacao());
        }
       for (int i = 0; i < lista.size(); i++) {
            System.out.println("O nome é: " + lista.get(i).getNome());
            Filme filme;
        }
        lista.forEach(b -> System.out.println(b.getNome()));


        ArrayList<String> buscaPorCantores = new ArrayList<>();

        buscaPorCantores.add("BK");
        buscaPorCantores.add("Djonga");
        buscaPorCantores.add("Veigh");
        buscaPorCantores.add("Mu540");
        buscaPorCantores.add("Kyan");

        System.out.println(buscaPorCantores);

        Collections.sort(buscaPorCantores);
        System.out.println("Em ordem alfabetica: \n" + buscaPorCantores);

        Collections.sort(lista);
        System.out.println("Lista em Ordem Alfabetica: \n" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Comparando por ano de lançamento: \n" + lista);*/


    }
}
