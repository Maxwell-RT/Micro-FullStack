package com.Modelados.Mensajeria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Traslado {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private long Id;



@Column(name="Fecha", nullable=false)
private String Fecha;


@Column(name="Estado", nullable=false)
private String Estado;
}
