package com.example.projeto.Service;


import com.example.projeto.Model.UsuarioModel;
import com.example.projeto.Repository.UsuarioRepository;
import com.example.projeto.dto.UsuarioRequestDTO;
import com.example.projeto.dto.UsuarioResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository repository;

    public List<UsuarioResponseDTO>listar(){
        return repository
                .findAll()
                .stream()
                .map(u -> new UsuarioResponseDTO(u.getNome(),u.getEmail()))
                .toList();
    }

    public UsuarioModel salvar (UsuarioRequestDTO model) {
        if (repository.findByEmail(model.getEmail()).isPresent()) {
            throw new RuntimeException("Usuario já cadastrado!");
        }
        UsuarioModel novo = new UsuarioModel();
        novo.setNome(model.getNome());
        novo.setEmail(model.getEmail());
        novo.setSenha(model.getSenha());
        return repository.save(novo);
    }
}
