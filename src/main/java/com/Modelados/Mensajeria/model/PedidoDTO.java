package com.Modelados.Mensajeria.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PedidoDTO {
private Long idPedido;
private Long idUsuario;
private String nombreCliente;
private boolean estadoPedido;
private LocalDate fechaPedido;
    
}
