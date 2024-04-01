package com.mibanco.clientecdtdigitalgrpc.es.utils.mapper;

import com.mibanco.clientecdtdigitalgrpc.es.entity.ClienteCDTDigitalGrpc;
import com.mibanco.clientecdtdigitalgrpc.es.proto.service.ClienteCDTDigital;
import org.mapstruct.Mapper;


@Mapper(componentModel = "cdi")
public interface ClienteCDTDigitalGrpcMapper {
    ClienteCDTDigital entityToClienteCDTDigital (ClienteCDTDigitalGrpc clienteCDTDigitalGrpc);

    ClienteCDTDigitalGrpc clienteCDTDigitalToEntity(ClienteCDTDigital request);

}
