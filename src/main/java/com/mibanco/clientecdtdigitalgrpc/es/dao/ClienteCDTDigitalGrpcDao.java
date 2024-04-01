package com.mibanco.clientecdtdigitalgrpc.es.dao;

import com.mibanco.clientecdtdigitalgrpc.es.entity.ClienteCDTDigitalGrpc;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.common.annotation.Blocking;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
@Blocking
public class ClienteCDTDigitalGrpcDao implements PanacheRepository<ClienteCDTDigitalGrpc> {
}
