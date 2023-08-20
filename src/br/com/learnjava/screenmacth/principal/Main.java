package br.com.learnjava.screenmacth.principal;

import br.com.learnjava.screenmacth.calculos.FiltroDeClassificacao;
import br.com.learnjava.screenmacth.modelos.Filme;
import br.com.learnjava.screenmacth.modelos.Serie;
import br.com.learnjava.screenmacth.calculos.CalculadorDeTempo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instanciando uma classe

        var tropa = new Filme("Tropa de Elite", 2100);

        tropa.setDuracaoEmMinutos(270);
        tropa.avalieFilme(10);
        tropa.exibeFichaTecnica();


        var fightClub = new Filme("Fight Club", 2000);

        fightClub.setDuracaoEmMinutos(229);
        fightClub.avalieFilme(7);
        fightClub.exibeFichaTecnica();


        Filme homemAranha = new Filme("Homem Aranha", 2014);

        homemAranha.setDuracaoEmMinutos(290);
        homemAranha.avalieFilme(9);

        homemAranha.exibeFichaTecnica();


        System.out.println(homemAranha.pegaMedia());

        System.out.println("O total de avaliações é: " + homemAranha.getTotalDeAvaliacao());

        Serie lost = new Serie("lost", 1900);

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(19);
        lost.setMinutosPorEpisodio(30);
        lost.setTotalDeVisualizacoes(200);

        System.out.println("O numero de eps por temp é: " + lost.getEpisodiosPorTemporada());
        System.out.println("Duração em minutos da série: " + lost.getDuracaoEmMinutos());

        CalculadorDeTempo calculadora = new CalculadorDeTempo();

        calculadora.inclui(lost);
        calculadora.inclui(homemAranha);
        calculadora.inclui(fightClub);

        System.out.println(calculadora.getTempoTotal());

        FiltroDeClassificacao filtro = new FiltroDeClassificacao();


        filtro.filtra(homemAranha);
        filtro.filtra(lost);
        filtro.filtra(fightClub);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(homemAranha);
        listaDeFilmes.add(tropa);
        listaDeFilmes.add(fightClub);

        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);


    }
}