package br.com.alura.forumHub.controller;

import br.com.alura.forumHub.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/respostas")
//    @SecurityRequirement(name = "bearer-key")

    public class RespostaController {
        @Autowired
        private RespostaService service;

    }


