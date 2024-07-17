/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.dao.ProviderDao;
import com.mibirra.proyectoFinal.domain.Provider;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maula
 */
public class ProviderServiceImpl implements ProviderService{
    @Autowired
    private ProviderDao providerDao;
    
    @Override
    public List<Provider> getProviders(int state) {
        var lista = providerDao.findAll();
        if (state == 1){
            lista.removeIf(c -> c.getState() == 0);
        }
        return lista;
    }

    @Override
    public Provider getProvider(Provider provider) {
        return providerDao.findById(provider.getIdProvider()).orElse(null);
    }

    @Override
    public void save(Provider provider) {
       providerDao.save(provider);
    }

    @Override
    public void delete(Provider provider) {
        
    providerDao.delete(provider);
    }
}