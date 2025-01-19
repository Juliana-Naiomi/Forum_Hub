package br.com.alura.forumHub.dto.response;

public record TopicoListDto(Long id,
                            String titulo,
                            String mensagem,
                            UsuarioIdDto autor,
                            CursoIdDto curso,
                            boolean status) {
    public TopicoListDto(Long id, String titulo, String mensagem, UsuarioIdDto autor, CursoIdDto curso, boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.autor = autor;
        this.curso = curso;
        this.status = status;
    }
}
