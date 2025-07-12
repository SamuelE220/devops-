package com.chill.DevOps.dto;

import lombok.Data;

@Data
public class ClienteDto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private int edad;
    private String dui;
    private String nit;
    private double altura;
    private double peso;
}
