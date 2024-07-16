
package com.mibirra.proyectoFinal.service;


import com.mibirra.proyectoFinal.domain.Categoria;
import java.util.List;

/**
 *
 * @author braym
 */
public interface CategoriaService {
    //Se enuncia un metodo que recupera los registros de la
    //tabla categoria dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Se obtiene un registro de la tabla categoria en un objeto categoria 
    //Si el IdCategoria existe si no se pasa un null
    
    public Categoria getCategoria(Categoria categoria);
    
    // Se crea un nuevo registro en categoria si el objeto Categoria no tiene
    //idCategoria osea esta vacio, se actualiza el registro en la tabla
    //Categoria si el objeto Categoria tiene un idCategoria
    
    public void save (Categoria categoria);
    
    //Se elimina el registro que tiene idCategoria
    
    public void delete (Categoria categoria);
    
    
    
}
