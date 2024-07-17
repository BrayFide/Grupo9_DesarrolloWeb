/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.service;

import com.mibirra.proyectoFinal.dao.ProductDao;
import com.mibirra.proyectoFinal.domain.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maula
 */
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;
    
    @Override
    public List<Product> getProducts(int state) {
        var lista = productDao.findAll();
        if (state == 1){
            lista.removeIf(c -> c.getState() == 0);
        }
        return lista;
    }

    @Override
    public Product getProduct(Product product) {
        return productDao.findById(product.getIdProduct()).orElse(null);
    }

    @Override
    public void save(Product product) {
       productDao.save(product);
    }

    @Override
    public void delete(Product product) {
        
    productDao.delete(product);
    }
}
