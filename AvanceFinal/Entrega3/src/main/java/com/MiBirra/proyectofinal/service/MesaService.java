
package com.MiBirra.proyectofinal.service;


import com.MiBirra.proyectofinal.domain.Mesa;
import java.util.List;

/**
 *
 * @author braym
 */
public interface MesaService {
//Se enuncia un metodo que recupera los registros de la
    //tabla mesa dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Mesa> getMesas(boolean activos);
    
    //Se obtiene un registro de la tabla mesa en un objeto mesa 
    //Si el IdMesa existe si no se pasa un null
    
    public Mesa getMesa(Mesa mesa);
    
//    // Se crea un nuevo registro en mesa si el objeto Mesa no tiene
//    //idMesa osea esta vacio, se actualiza el registro en la tabla
//    //Mesa si el objeto Mesa tiene un idMesa
//    
//    public void save (Mesa mesa);
//    
//    //Se elimina el registro que tiene idMesa
//    
//    public void delete (Mesa mesa);
    }