package com.example.api_rev.repository;

import com.example.api_rev.model.ColaboradorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ColaboradorRepository extends JpaRepository<ColaboradorModel,Long> {

    Optional<ColaboradorModel> findByEmail(String email);
}
