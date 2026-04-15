package com.example.api_rev.controller;


import com.example.api_rev.model.ColaboradorModel;
import com.example.api_rev.service.ColaboradorService;
import com.example.api_rev.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @GetMapping
    public List<ColaboradorModel>listar(){
        return service.list();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>>salvar(@RequestBody ColaboradorModel model){
        service.salvar(model);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("MENSAGEM: ","Colaborador salvo com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,String>>atualizar(
            @PathVariable Long id,
            @RequestBody ColaboradorModel model){
        service.atualizar(id, model);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("MENSAGEM: ", "Colaborador atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,String>>excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("MENSAGEM: ","Excluir colaborador"));
    }
}
