
package com.MiBirra.proyectofinal.service;


import com.MiBirra.proyectofinal.domain.Compra;
import java.util.List;

/**
 *
 * @author braym
 */
public interface CompraService {
//Se enuncia un metodo que recupera los registros de la
    //tabla mesa dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Compra> getCompras(boolean activos);
    
    //Se obtiene un registro de la tabla mesa en un objeto mesa 
    //Si el IdCompra existe si no se pasa un null
    
    public Compra getCompra(Compra compra);
    
    // Se crea un nuevo registro en mesa si el objeto Compra no tiene
    //idCompra osea esta vacio, se actualiza el registro en la tabla
    //Compra si el objeto Compra tiene un idCompra
    
    public void save (Compra mesa);
    
    //Se elimina el registro que tiene idCompra
    
    public void delete (Compra mesa);
    }