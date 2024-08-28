
package com.MiBirra.proyectofinal.service.impl;



import com.MiBirra.proyectofinal.dao.CompraDao;
import com.MiBirra.proyectofinal.domain.Compra;
import com.MiBirra.proyectofinal.service.CompraService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author braym
 */
@Service
public class CompraServiceImpl implements CompraService{

 @Autowired
    private CompraDao compraDao;
    
    @Override
    
    public List<Compra> getCompras(boolean activos) {
        var lista = compraDao.findAll();
        if (activos){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    public Compra getCompra(Compra compra) {
        return compraDao.findById(compra.getIdCompra()).orElse(null);
    }

    @Override
    public void save(Compra compra) {
       compraDao.save(compra);
    }

    @Override
    public void delete(Compra compra) {
        
    compraDao.delete(compra);
    }

    
    
}

