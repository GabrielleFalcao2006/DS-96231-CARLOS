package com.example.DTO.service;


import com.example.DTO.dto.FuncionarioRequestDTO;
import com.example.DTO.dto.FuncionarioResponseDTO;
import com.example.DTO.model.FuncionarioModel;
import com.example.DTO.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDTO> listar() {
        return repository
                .findAll()
                .stream()
                .map(f -> new FuncionarioResponseDTO(
                        f.getNome(),
                        f.getEmail(),
                        f.getTelefone()
                ))
                .toList();
    }

    public FuncionarioModel salvar(FuncionarioRequestDTO dto) {
        if (repository.finfByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Funcionário já cadastrado");
        }
        FuncionarioModel novoFuncionario = new FuncionarioModel();
        novoFuncionario.setNome(dto.getNome());
        novoFuncionario.setEmail(dto.getEmail());
        novoFuncionario.setTelefone(dto.getTelefone());
        novoFuncionario.setSenha(passwordEncoder.encode(dto.getSenha()));

        return repository.save(novoFuncionario);
    }
}
