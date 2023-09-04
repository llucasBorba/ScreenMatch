package br.com.learnjava.screenmacth.execptions;

public class ErroNoAnoException extends RuntimeException {


    @Override
    public String getMessage() {
        return "O tamanho do ano não esta correto!";
    }
}
