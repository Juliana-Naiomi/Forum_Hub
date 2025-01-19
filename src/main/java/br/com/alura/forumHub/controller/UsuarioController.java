package br.com.alura.forumHub.controller;


import br.com.alura.forumHub.dto.request.UsuarioDto;
import br.com.alura.forumHub.dto.response.UsuarioDetalhamentoDto;
import br.com.alura.forumHub.dto.response.UsuarioIdDto;
import br.com.alura.forumHub.service.UsuarioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
//@SecurityRequirement(name = "bearer-key")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("")
    @Transactional
    public ResponseEntity<String> cadastrarUsuario(@RequestBody @Valid UsuarioDto userDTO,
                                                   UriComponentsBuilder uriComponentsBuilder) {
        Long userId = usuarioService.saveUser(userDTO);
        var uri = uriComponentsBuilder.path("/usuario/{id}")
                .buildAndExpand(userId).toUri();
        return ResponseEntity.created(uri)
                .body("Usuário registrado com sucesso. Id: " + userId);
    }

    @GetMapping("")
    public ResponseEntity<Page<UsuarioIdDto>> listarUsuarios(Pageable pageable) {
        Page<UsuarioIdDto> usersPage = usuarioService.getAllUsers(pageable);
        return ResponseEntity.ok(usersPage);
    }


    @PutMapping("/{userId}")
    public ResponseEntity<String> atualizarUsuario(
            @PathVariable Long userId,
            @RequestBody UsuarioIdDto usuarioInfo) {

        usuarioService.updateUser(userId, usuarioInfo);
        return ResponseEntity.ok("Usuário atualizado com sucesso.");

    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUsuarios(@PathVariable Long userId) {

        usuarioService.deleteUser(userId);
        return ResponseEntity.noContent().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDetalhamentoDto> detalharUsuario(@PathVariable Long id) {
        Optional<UsuarioDetalhamentoDto> detalheOptional = usuarioService.detalharUsuario(id);

        return detalheOptional
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
