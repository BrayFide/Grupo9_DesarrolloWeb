/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.domain.Product;
import java.util.List;

/**
 *
 * @author maula
 */
public interface ProductService {
    //Se enuncia un metodo que recupera los registros de la
    //tabla product dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Product> getProducts(int state);
    
    //Se obtiene un registro de la tabla product en un objeto product 
    //Si el IdProduct existe si no se pasa un null
    
    public Product getProduct(Product product);
    
    // Se crea un nuevo registro en product si el objeto Product no tiene
    //idProduct osea esta vacio, se actualiza el registro en la tabla
    //Product si el objeto Product tiene un idProduct
    
    public void save (Product product);
    
    //Se elimina el registro que tiene idProduct
    
    public void delete (Product product);
}
