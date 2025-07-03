package com.example.fincas_grupo3.infrastructure.mappers.finca;

import com.example.fincas_grupo3.domain.models.finca.Finca;
import com.example.fincas_grupo3.infrastructure.entities.finca.FincaEntidad;
import com.example.fincas_grupo3.infrastructure.mappers.direccion.DireccionMapper;
import com.example.fincas_grupo3.infrastructure.mappers.servicio.ServicioMapper;
import com.example.fincas_grupo3.infrastructure.mappers.usuario.UsuarioMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {DireccionMapper.class, UsuarioMapper.class, ServicioMapper.class},
        implementationName = "fincaMapperInfra")
public abstract class FincaMapper {

    public abstract Finca toModel(FincaEntidad entidad);

    public abstract FincaEntidad toEntity(Finca finca);
}