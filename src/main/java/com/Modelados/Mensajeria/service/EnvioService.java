package com.Modelados.Mensajeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Modelados.Mensajeria.model.Envio;
import com.Modelados.Mensajeria.repository.EnvioRepository;

@Service
public class EnvioService {


@Autowired
    private EnvioRepository envioRepository;

@Autowired
private RestTemplate restTemplate;



public Envio actualizardireccion(Envio envio){
String url= "http://localhost:8081/api/direcciones/" + envio.getDireccionEntrega();
return envioRepository.save(envio);
}

public List<Envio> listar(){
    return envioRepository.findAll();
}


}