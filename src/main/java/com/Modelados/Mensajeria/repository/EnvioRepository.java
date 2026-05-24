package com.Modelados.Mensajeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Modelados.Mensajeria.model.Envio;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Long>{

}
