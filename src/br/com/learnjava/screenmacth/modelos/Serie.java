package br.com.learnjava.screenmacth.modelos;

import br.com.learnjava.screenmacth.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;
    private int anoDeLancamento;
    private int totalDeVisualizacoes;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        if (anoDeLancamento < 1895 ) {
            System.out.println("Nem existia serie mané");
        }else {
            this.anoDeLancamento = anoDeLancamento;
        }}

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return episodiosPorTemporada * minutosPorEpisodio * temporadas;
    }

    public void exibeFichaTecnica(){
        System.out.println("\nNome da Serie: " + nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    }


    @Override
    public int getClassificacao() {
        if (totalDeVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
