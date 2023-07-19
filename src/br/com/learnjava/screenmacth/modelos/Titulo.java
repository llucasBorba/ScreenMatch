package br.com.learnjava.screenmacth.modelos;

public class Titulo {

    //Declarar atributos de uma classe
    String nome;
    private int anoDeLancamento;
    int duracaoEmMinutos;
    private boolean incluidoNoPLano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        if ( anoDeLancamento < 1895 ) {
            System.out.println("Nem existia filme mané");
        }else {
            this.anoDeLancamento = anoDeLancamento;
        }}

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

}
