/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MiBirra.proyectofinal.service;

import com.MiBirra.proyectofinal.domain.Producto;
import java.util.List;

/**
 *
 * @author maula
 */
public interface ProductoService {
    //Se enuncia un metodo que recupera los registros de la
    //tabla producto dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Producto> getProductos(int state);
    
    //Se obtiene un registro de la tabla producto en un objeto producto 
    //Si el IdProducto existe si no se pasa un null
    
    public Producto getProducto(Producto producto);
    
    // Se crea un nuevo registro en producto si el objeto Productoo no tiene
    //idProducto osea esta vacio, se actualiza el registro en la tabla
    //Producto si el objeto Productoo tiene un idProducto
    
    public void save (Producto producto);
    
    //Se elimina el registro que tiene idProducto
    
    public void delete (Producto producto);
}
