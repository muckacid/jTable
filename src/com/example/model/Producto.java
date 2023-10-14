/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import java.time.LocalDate;

/**
 *
 * @author morag
 */
public class Producto {

    private String modelo;
    private String marca;
    private int precio;
    private int cantidad;
    private Categoria categoria;
    private LocalDate fechaElaboracion;
    private String descripcion;
    
    public Producto() {
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaElaboracion() {
        return fechaElaboracion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getCategoria(){
        return categoria.getNombre();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaElaboracion(LocalDate fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", cantidad=" + cantidad + ", fechaElaboracion=" + fechaElaboracion + ", descripcion=" + descripcion + '}';
    }
    
    
}
