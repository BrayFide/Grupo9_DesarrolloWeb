
package com.MiBirra.proyectofinal.service.impl;


import com.MiBirra.proyectofinal.dao.MesaDao;
import com.MiBirra.proyectofinal.domain.Mesa;
import com.MiBirra.proyectofinal.service.MesaService;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author braym
 */
@Service
public class MesaServiceImpl implements MesaService{

 @Autowired
    private MesaDao mesaDao;
    
    @Override
    
    public List<Mesa> getMesas(boolean activos) {
        var lista = mesaDao.findAll();
        if (activos){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    public Mesa getMesa(Mesa mesa) {
        return mesaDao.findById(mesa.getIdMesa()).orElse(null);
    }

//    @Override
//    public void save(Mesa mesa) {
//       mesaDao.save(mesa);
//    }
//
//    @Override
//    public void delete(Mesa mesa) {
//        
//    mesaDao.delete(mesa);
//    }
//
//    @Override
//    public List<Mesa> getMesas(int activos) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}

