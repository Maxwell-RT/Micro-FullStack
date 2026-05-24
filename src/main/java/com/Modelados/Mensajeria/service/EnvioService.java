package com.Modelados.Mensajeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Modelados.Mensajeria.model.Envio;
import com.Modelados.Mensajeria.repository.EnvioRepository;

@Service
public class EnvioService {


@Autowired
    private EnvioRepository envioRepository;

public List<Envio> listar(){
    return envioRepository.findAll();
}




}
