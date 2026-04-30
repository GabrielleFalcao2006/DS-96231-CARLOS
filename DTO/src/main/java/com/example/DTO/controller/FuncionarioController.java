package com.example.DTO.controller;


import com.example.DTO.dto.FuncionarioRequestDTO;
import com.example.DTO.dto.FuncionarioResponseDTO;
import com.example.DTO.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>>listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listar());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody FuncionarioRequestDTO dto){
        service.salvar(dto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("Mensagem","Funcionário cadastrado com sucesso!!!!"));
    }
}
