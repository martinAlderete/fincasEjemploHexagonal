package com.example.fincas_grupo3.application.dto.tiporeserva;

public class TipoReservaRequestDTO {
    private Long id;
    private String nombre;


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
}