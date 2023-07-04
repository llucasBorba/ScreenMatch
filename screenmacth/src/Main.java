
import br.com.learnjava.screenmacth.Filme;
import br.com.learnjava.screenmacth.Serie;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instanciando uma classe
        Filme meuFilme = new Filme();

        System.out.println("""
                        
                        Digite o nome do filme:
                         """);
        String nome = scanner.nextLine();
        meuFilme.setNome(nome);

        System.out.println( "Digite  o ano de lançamento: ");
        int anoDeLancamento = scanner.nextInt();
        scanner.nextLine();
        meuFilme.setAnoDeLancamento(anoDeLancamento);

        System.out.println( "\nDigite  a minutagem do filme: ");
        int duracaoEmMinutos  = scanner.nextInt();
        scanner.nextLine();
        meuFilme.setDuracaoEmMinutos(duracaoEmMinutos);
        meuFilme.exibeFichaTecnica();
        System.out.println( "A duração do filme em minutos é:  " + meuFilme.getDuracaoEmMinutos());


       /* System.out.println("\nDigite as notas do filme e digite sair quando não tiver mais notas  ");
        String exit = scanner.nextLine();

        while (!exit.equalsIgnoreCase("sair")) {
            double nota = Double.parseDouble(exit);
            meuFilme.avalieFilme(nota);
            exit = scanner.nextLine();
        }

        System.out.println(meuFilme.pegaMedia());
        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacao());*/

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("lost");
        minhaSerie.setAnoDeLancamento(1900);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(19);
        minhaSerie.setMinutosPorEpisodio(30);
        System.out.println("O numero de eps por temp é: " + minhaSerie.getEpisodiosPorTemporada());
        System.out.println("Duração em minutos da série: " + minhaSerie.getDuracaoEmMinutos());
    }
}
