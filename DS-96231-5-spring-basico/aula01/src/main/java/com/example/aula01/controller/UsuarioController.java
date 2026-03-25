package com.example.aula01.controller;

import com.example.aula01.models.UsuarioModel;
import com.example.aula01.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {
        private UsuarioRepository usuarioRepository;

        public UsuarioController(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        // Consultar todos os usuários.
    @GetMapping
    public List<UsuarioModel> listarTodos () {
            return usuarioRepository.findAll();
    }
}
