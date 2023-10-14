/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tableModel;

import com.example.model.Producto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author morag
 */
public class TMProducto extends AbstractTableModel{

    private ArrayList<Producto> lista;

    public TMProducto(ArrayList<Producto> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = lista.get(rowIndex);
        
        return switch (columnIndex) {
            case 0 -> producto.getModelo();
            case 1 -> producto.getMarca();
            case 2 -> "$ " + producto.getPrecio();
            case 3 -> producto.getCantidad();
            case 4 -> producto.getFechaElaboracion().toString();
            default -> "";
        };
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Modelo";
            case 1 -> "Marca";
            case 2 -> "Precio";
            case 3 -> "Cantidad";
            case 4 -> "Elaboración";
            default -> "";
        };
    }
    
}
