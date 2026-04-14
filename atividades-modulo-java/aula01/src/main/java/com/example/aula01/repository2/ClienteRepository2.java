package com.example.aula01.repository2;

import com.example.aula01.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface ClienteRepository2 extends JpaRepository <ClienteModel, Long> {

}


