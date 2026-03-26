package com.example.aula01.controller;


import com.example.aula01.models.ProdutoModel;
import com.example.aula01.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<ProdutoModel> listarTodos () {
        return produtoRepository.findAll();

    }
    @PostMapping
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto){
        produtoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<String> deletar(@PathVariable(value = "id") Long id) {
        Optional<ProdutoModel> produto = produtoRepository.findById(id);

        if (produto.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        produtoRepository.delete(produto.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso.");
    }

}
