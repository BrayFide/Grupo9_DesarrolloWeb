/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiBirra.proyectofinal.service.impl;

import com.MiBirra.proyectofinal.domain.Proveedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MiBirra.proyectofinal.dao.ProveedorDao;
import com.MiBirra.proyectofinal.service.ProveedorService;

/**
 *
 * @author maula
 */
@Service
public class ProveedorServiceImpl implements ProveedorService{
    @Autowired
    private ProveedorDao proveedorDao;
    
    @Override
    public List<Proveedor> getProveedores(int state) {
        var lista = proveedorDao.findAll();
        if (state == 1){
            lista.removeIf(c -> c.getEstado()== 0);
        }
        return lista;
    }

    @Override
    public Proveedor getProveedor(Proveedor proveedor) {
        return proveedorDao.findById(proveedor.getIdProveedor()).orElse(null);
    }

    @Override
    public void save(Proveedor proveedor) {
       proveedorDao.save(proveedor);
    }

    @Override
    public void delete(Proveedor proveedor) {
        
    proveedorDao.delete(proveedor);
    }
}