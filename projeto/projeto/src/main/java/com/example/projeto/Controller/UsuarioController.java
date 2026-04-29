package com.example.projeto.Controller;


import com.example.projeto.Service.UsuarioService;
import com.example.projeto.dto.UsuarioRequestDTO;
import com.example.projeto.dto.UsuarioResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>>listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(
            @Valid @RequestBody UsuarioRequestDTO dto){
        service.salvar(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem: ","Usuário cadastrado com sucesso!"));
    }


}
