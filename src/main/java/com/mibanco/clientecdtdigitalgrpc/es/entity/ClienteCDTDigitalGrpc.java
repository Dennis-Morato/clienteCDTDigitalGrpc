package com.mibanco.clientecdtdigitalgrpc.es.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
@Entity
@Table(name = "clienteCDTDigital")
public class ClienteCDTDigitalGrpc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String mail;
}
