package br.com.learnjava.screenmacth.execptions;

public class ErroNoAnoException extends RuntimeException {


    @Override
    public String getMessage() {
        return "O ano tá grande";
    }
}
