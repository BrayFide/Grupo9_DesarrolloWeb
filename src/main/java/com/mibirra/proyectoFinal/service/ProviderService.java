/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.domain.Provider;
import java.util.List;

/**
 *
 * @author maula
 */
public interface ProviderService {
    //Se enuncia un metodo que recupera los registros de la
    //tabla provider dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Provider> getProviders(int state);
    
    //Se obtiene un registro de la tabla provider en un objeto provider 
    //Si el IdProvider existe si no se pasa un null
    
    public Provider getProvider(Provider provider);
    
    // Se crea un nuevo registro en provider si el objeto Provider no tiene
    //idProvider osea esta vacio, se actualiza el registro en la tabla
    //Provider si el objeto Provider tiene un idProvider
    
    public void save (Provider provider);
    
    //Se elimina el registro que tiene idProvider
    
    public void delete (Provider provider);
}
