package br.com.learnjava.screenmacth.calculos;

import br.com.learnjava.screenmacth.modelos.Titulo;

import java.util.Scanner;

public class CalcularNota {
    public double notinhas (Titulo titulo){
     Scanner scanner = new Scanner(System.in);
     double nota = 0.0;

      System.out.println ("\nDigite as notas do filme e digite 'sair' quando não tiver mais notas  ");
    String exit = scanner.nextLine();

        while (!exit.equalsIgnoreCase("sair")) {
            nota += Double.parseDouble(exit);
            exit = scanner.nextLine();
     }
        return nota;
    }
}