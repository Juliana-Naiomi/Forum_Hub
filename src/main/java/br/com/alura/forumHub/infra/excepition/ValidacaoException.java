package br.com.alura.forumHub.infra.excepition;

public class ValidacaoException extends RuntimeException{
    public ValidacaoException(String mensagem) {
        super (mensagem);
    }
}
