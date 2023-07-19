package br.com.learnjava.screenmacth.calculos;

import br.com.learnjava.screenmacth.modelos.Titulo;

import java.util.Scanner;

public class Storage {

    Scanner scanner = new Scanner(System.in);
    private br.com.learnjava.screenmacth.modelos.Titulo Titulo;

    public void guardando( Titulo titulo) {


           System.out.println("""
                                        
                Digite o nome do filme:
                 """);
    String nome = scanner.nextLine();
        Titulo .setNome(nome);


        System.out.println("Digite  o ano de lançamento: ");
    int anoDeLancamento = scanner.nextInt();
        scanner.nextLine();
        Titulo.setAnoDeLancamento(anoDeLancamento);

        System.out.println("\nDigite  a minutagem do filme: ");
    int duracaoEmMinutos = scanner.nextInt();
        scanner.nextLine();
        Titulo.setDuracaoEmMinutos(duracaoEmMinutos);

        Titulo.exibeFichaTecnica();
        System.out.println("A duração do filme em minutos é:  "+ Titulo.getDuracaoEmMinutos());
}


}
