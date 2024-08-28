/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MiBirra.proyectofinal.service;

import com.MiBirra.proyectofinal.domain.Proveedor;
import java.util.List;

/**
 *
 * @author maula
 */
public interface ProveedorService {
    //Se enuncia un metodo que recupera los registros de la
    //tabla proveedor dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Proveedor> getProveedores(int state);
    
    //Se obtiene un registro de la tabla proveedor en un objeto proveedor 
    //Si el IdProveedor existe si no se pasa un null
    
    public Proveedor getProveedor(Proveedor proveedor);
    
    // Se crea un nuevo registro en proveedor si el objeto Proveedor no tiene
    //idProveedor osea esta vacio, se actualiza el registro en la tabla
    //Proveedor si el objeto Proveedor tiene un idProveedor
    
    public void save (Proveedor proveedor);
    
    //Se elimina el registro que tiene idProveedor
    
    public void delete (Proveedor proveedor);
}
