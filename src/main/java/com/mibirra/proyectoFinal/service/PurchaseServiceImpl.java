/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.dao.PurchaseDao;
import com.mibirra.proyectoFinal.domain.Purchase;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maula
 */
public class PurchaseServiceImpl implements PurchaseService{
    @Autowired
    private PurchaseDao purchaseDao;
    
    @Override
    public List<Purchase> getPurchases(int state) {
        var lista = purchaseDao.findAll();
        if (state == 1){
            lista.removeIf(c -> c.getState() == 0);
        }
        return lista;
    }

    @Override
    public Purchase getPurchase(Purchase purchase) {
        return purchaseDao.findById(purchase.getIdPurchase()).orElse(null);
    }

    @Override
    public void save(Purchase purchase) {
       purchaseDao.save(purchase);
    }

    @Override
    public void delete(Purchase purchase) {
        
    purchaseDao.delete(purchase);
    }
}