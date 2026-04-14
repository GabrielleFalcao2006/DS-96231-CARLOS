package com.example.aula01.repository;

import com.example.aula01.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> { //Já define classe,
    // chave primária
}



