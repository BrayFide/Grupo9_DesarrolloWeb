/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.domain.Purchase;
import java.util.List;

/**
 *
 * @author maula
 */
public interface PurchaseService {
    //Se enuncia un metodo que recupera los registros de la
    //tabla purchase dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Purchase> getPurchases(int state);
    
    //Se obtiene un registro de la tabla purchase en un objeto purchase 
    //Si el IdPurchase existe si no se pasa un null
    
    public Purchase getPurchase(Purchase purchase);
    
    // Se crea un nuevo registro en purchase si el objeto Purchase no tiene
    //idPurchase osea esta vacio, se actualiza el registro en la tabla
    //Purchase si el objeto Purchase tiene un idPurchase
    
    public void save (Purchase purchase);
    
    //Se elimina el registro que tiene idPurchase
    
    public void delete (Purchase purchase);
}
