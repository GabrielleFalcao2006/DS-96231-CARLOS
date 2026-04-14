package com.example.aula01.controller;

import com.example.aula01.models.ProdutoModel;
import com.example.aula01.models.UsuarioModel;
import com.example.aula01.repository.UsuarioRepository;
import jakarta.persistence.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario){
            usuarioRepository.save(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

}
