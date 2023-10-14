/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.db;

import com.example.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author morag
 */
public class DataProducto {
    
    private ArrayList<Producto> listaProductos;

    public DataProducto() {
        listaProductos = new ArrayList<>();
    }
    
    public void addProducto(Producto p){
        listaProductos.add(p);
    }
    
    public ArrayList<Producto> getList(){
        return this.listaProductos;
    }
    
}
