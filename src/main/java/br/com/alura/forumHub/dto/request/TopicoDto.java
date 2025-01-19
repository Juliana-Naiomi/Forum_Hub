package br.com.alura.forumHub.dto.request;

import br.com.alura.forumHub.dto.response.CursoIdDto;
import br.com.alura.forumHub.dto.response.UsuarioIdDto;
import jakarta.validation.constraints.NotBlank;

public record TopicoDto(@NotBlank String titulo,
                        @NotBlank String mensagem,
                        UsuarioIdDto autor,
                        CursoIdDto curso
) {
}
