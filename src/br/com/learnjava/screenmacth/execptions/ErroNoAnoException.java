package br.com.learnjava.screenmacth.execptions;

public class ErroNoAnoException extends RuntimeException {
    private String message = "Ouve um erro no tamanho do ano ";


    @Override
    public String getMessage() {
        return message;
    }
}
