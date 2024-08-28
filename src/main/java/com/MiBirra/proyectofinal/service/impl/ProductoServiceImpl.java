/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiBirra.proyectofinal.service.impl;

import com.MiBirra.proyectofinal.domain.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MiBirra.proyectofinal.dao.ProductoDao;
import com.MiBirra.proyectofinal.service.ProductoService;

/**
 *
 * @author maula
 */
@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    public List<Producto> getProductos(int state) {
        var lista = productoDao.findAll();
        if (state == 1){
            lista.removeIf(c -> c.getEstado()== 0);
        }
        return lista;
    }

    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void save(Producto producto) {
       productoDao.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        
    productoDao.delete(producto);
    }
}
