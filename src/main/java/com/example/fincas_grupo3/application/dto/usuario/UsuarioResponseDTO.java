package com.example.fincas_grupo3.application.dto.usuario;

import com.example.fincas_grupo3.application.dto.direccion.DireccionResponseDTO;

public class UsuarioResponseDTO {
    private Long id;
    private  String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private DireccionResponseDTO direccionResponseDTO;

    public UsuarioResponseDTO(Long id, String nombre, String apellido, String correo, String telefono, DireccionResponseDTO direccionResponseDTO) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccionResponseDTO = direccionResponseDTO;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DireccionResponseDTO getDireccionResponseDTO() {
        return direccionResponseDTO;
    }

    public void setDireccionResponseDTO(DireccionResponseDTO direccionResponseDTO) {
        this.direccionResponseDTO = direccionResponseDTO;
    }
}

