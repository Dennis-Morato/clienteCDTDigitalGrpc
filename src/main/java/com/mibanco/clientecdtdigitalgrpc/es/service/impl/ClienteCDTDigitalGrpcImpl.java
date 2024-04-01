package com.mibanco.clientecdtdigitalgrpc.es.service.impl;

import com.google.protobuf.Empty;
import com.mibanco.clientecdtdigitalgrpc.es.constant.Constant;
import com.mibanco.clientecdtdigitalgrpc.es.dao.ClienteCDTDigitalGrpcDao;
import com.mibanco.clientecdtdigitalgrpc.es.entity.ClienteCDTDigitalGrpc;
import com.mibanco.clientecdtdigitalgrpc.es.proto.service.ClienteCDTDigital;
import com.mibanco.clientecdtdigitalgrpc.es.proto.service.ClienteCDTDigitalList;
import com.mibanco.clientecdtdigitalgrpc.es.proto.service.ClienteCDTDigitalService;
import com.mibanco.clientecdtdigitalgrpc.es.utils.exceptions.ApplicationException;
import com.mibanco.clientecdtdigitalgrpc.es.utils.mapper.ClienteCDTDigitalGrpcMapper;
import io.grpc.stub.annotations.GrpcGenerated;
import io.smallrye.mutiny.Uni;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
@GrpcGenerated
public class ClienteCDTDigitalGrpcImpl implements ClienteCDTDigitalService {
    private  static  final Logger LOG = LoggerFactory.getLogger(ClienteCDTDigitalGrpcImpl.class);

    private final ClienteCDTDigitalGrpcDao clienteCDTDigitalGrpcDao;
    private final ClienteCDTDigitalGrpcMapper mapper;
    public ClienteCDTDigitalGrpcImpl(ClienteCDTDigitalGrpcDao clienteCDTDigitalGrpcDao, ClienteCDTDigitalGrpcMapper mapper) {
        this.clienteCDTDigitalGrpcDao = clienteCDTDigitalGrpcDao;
        this.mapper = mapper;
    }

    @Override
    public Uni<ClienteCDTDigital> create(ClienteCDTDigital request) {
        LOG.info("Inicia proceso de crearClienteCDTDigital impl");
        try {
            ClienteCDTDigitalGrpc entity = mapper.clienteCDTDigitalToEntity(request);
            entity.setId(null);
            return clienteCDTDigitalGrpcDao.persistAndFlush(entity).map(mapper::entityToClienteCDTDigital);
        }catch (ApplicationException e){
            LOG.error(Constant.ERROR_SERVICIO  + e.getMessage() + "crearClienteCDTDigital impl");
            return Uni.createFrom().failure(new RuntimeException(Constant.ERROR_SERVICIO + e.getMessage() + "crearClienteCDTDigital impl"));
        }
    }

    @Override
    public Uni<ClienteCDTDigitalList> list(Empty request) {
        return null;
    }
}
