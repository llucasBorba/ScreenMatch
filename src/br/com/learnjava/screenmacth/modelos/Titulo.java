package br.com.learnjava.screenmacth.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    //Declarar atributos de uma classe
    @SerializedName("Title")
    String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    int duracaoEmMinutos;
    private boolean incluidoNoPLano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        if ( anoDeLancamento < 1895 ) {
            System.out.println("Nem existia filme mané");
        }else {
            this.anoDeLancamento = anoDeLancamento;
        }
    }
    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Metodos de uma classe
    public void exibeFichaTecnica(){
        System.out.println("\nNome do filme: " + nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("A duração em minutos é: " + duracaoEmMinutos);
    }

    public void avalieFilme(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia ( ){
        return somaAvaliacao / totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

}
