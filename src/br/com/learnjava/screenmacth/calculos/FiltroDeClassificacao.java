package br.com.learnjava.screenmacth.calculos;

public class FiltroDeClassificacao {

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4 ){
            System.out.println("Top!");
        } else if ( classificavel.getClassificacao() >= 2) {
            System.out.println("Ok");
        }else {
            System.out.println("Ruim");
        }
    }
}
