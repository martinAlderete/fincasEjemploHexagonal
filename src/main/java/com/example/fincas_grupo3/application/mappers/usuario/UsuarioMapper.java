package com.example.fincas_grupo3.application.mappers.usuario;

import com.example.fincas_grupo3.application.dto.direccion.DireccionResponseDTO;
import com.example.fincas_grupo3.application.dto.usuario.UsuarioRequestDTO;
import com.example.fincas_grupo3.application.dto.usuario.UsuarioResponseDTO;
import com.example.fincas_grupo3.application.exceptions.DireccionNoEncontradaException;
import com.example.fincas_grupo3.application.usecases.direccion.DireccionUseCases;
import com.example.fincas_grupo3.domain.models.direccion.Direccion;
import com.example.fincas_grupo3.domain.models.usuario.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;


@Mapper(componentModel = "spring", implementationName = "usuarioMapperApplication")
public abstract class UsuarioMapper {

    @Autowired
    protected DireccionUseCases direccionUseCases;

    @Mapping(source = "direccionId", target = "direccion", qualifiedByName = "mapDireccionIdToDireccion")
    public abstract Usuario toModel(UsuarioRequestDTO dto);


    @Mapping(source = "direccion", target = "direccion", qualifiedByName = "toDireccionDTO")
    public abstract UsuarioResponseDTO toDTO(Usuario usuario);


    @Named("mapDireccionIdToDireccion")
    protected Direccion mapDireccionIdToDireccion(Long direccionId) {
        if (direccionId == null) {
            return null;
        }
            Direccion direccion = direccionUseCases.obtenerDireccionPorId(direccionId);
        if (direccion == null) {
            throw new DireccionNoEncontradaException("Direccion con id " + direccionId + " no encontrada.");
        }
        return direccion;
    }

    @Named("toDireccionDTO")
    public DireccionResponseDTO toDireccionDTO(Direccion direccion) {
        if (direccion == null) {
            return null;
        }
        direccion = direccionUseCases.obtenerDireccionPorId(direccion.getId());
        return new DireccionResponseDTO(direccion.getId(), direccion.getCalle(), direccion.getNumero(), direccion.getCodigoPostal(), direccion.getCiudad().getNombre());
    }
}