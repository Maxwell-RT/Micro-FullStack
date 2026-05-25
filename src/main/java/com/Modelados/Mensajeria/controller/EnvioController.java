package com.Modelados.Mensajeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Modelados.Mensajeria.model.Envio;
import com.Modelados.Mensajeria.service.EnvioService;





@RestController
@RequestMapping("api/v1/Envios")
public class EnvioController {

@Autowired
    private EnvioService envioService;


@GetMapping()
public List<Envio>Listar(){
    return envioService.listar();
}

@GetMapping("Actualizar direccion")
public ResponseEntity<String> actualizardireccion(
@PathVariable String direccionEntrega)
{
    return ResponseEntity.ok("Direccion actualizada");
}







}




