package com.example.fincas_grupo3.domain.models.rol;

public class Rol {
    private String nombre;
    private Long id;

    public Rol(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
