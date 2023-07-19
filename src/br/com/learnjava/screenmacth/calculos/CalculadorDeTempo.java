package br.com.learnjava.screenmacth.calculos;

import br.com.learnjava.screenmacth.modelos.Titulo;

public class CalculadorDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void incui(Filme f ){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//   public void incui(Serie s ){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){

        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
