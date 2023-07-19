
import br.com.learnjava.screenmacth.calculos.FiltroDeClassificacao;
import br.com.learnjava.screenmacth.modelos.Filme;
import br.com.learnjava.screenmacth.modelos.Serie;
import br.com.learnjava.screenmacth.calculos.CalculadorDeTempo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instanciando uma classe

        var tropa = new Filme();

        tropa.setNome("Tropa de Elite");
        tropa.setAnoDeLancamento(2100);
        tropa.setDuracaoEmMinutos(270);
        tropa.avalieFilme(10);
        tropa.exibeFichaTecnica();


        var fightClub = new Filme();

        fightClub.setNome("Fight Club");
        fightClub.setAnoDeLancamento(2000);
        fightClub.setDuracaoEmMinutos(229);
        fightClub.avalieFilme(7);
        fightClub.exibeFichaTecnica();


        Filme meuFilme = new Filme();

        meuFilme.setNome("Homem Aranha");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(290);
        meuFilme.avalieFilme(9);

        meuFilme.exibeFichaTecnica();


        System.out.println(meuFilme.pegaMedia());

        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacao());

        Serie lost = new Serie();

        lost.setNome("lost");
        lost.setAnoDeLancamento(1900);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(19);
        lost.setMinutosPorEpisodio(30);
        lost.setTotalDeVisualizacoes(200);

        System.out.println("O numero de eps por temp é: " + lost.getEpisodiosPorTemporada());
        System.out.println("Duração em minutos da série: " + lost.getDuracaoEmMinutos());

        CalculadorDeTempo calculadora = new CalculadorDeTempo();

        calculadora.inclui(lost);
        calculadora.inclui(meuFilme);
        calculadora.inclui(fightClub);

        System.out.println(calculadora.getTempoTotal());

        FiltroDeClassificacao filtro = new FiltroDeClassificacao();


         filtro.filtra(meuFilme);
         filtro.filtra(lost);
         filtro.filtra(fightClub);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(tropa);
        listaDeFilmes.add(fightClub);

        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);





    }
}