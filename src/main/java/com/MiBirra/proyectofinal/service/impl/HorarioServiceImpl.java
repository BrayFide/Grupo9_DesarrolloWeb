
package com.MiBirra.proyectofinal.service.impl;



import com.MiBirra.proyectofinal.dao.HorarioDao;
import com.MiBirra.proyectofinal.domain.Horario;
import com.MiBirra.proyectofinal.service.HorarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author braym
 */
@Service
public class HorarioServiceImpl implements HorarioService{

 @Autowired
    private HorarioDao horarioDao;
    
    @Override
    
    public List<Horario> getHorarios(boolean activos) {
        var lista = horarioDao.findAll();
        if (activos){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    public Horario getHorario(Horario horario) {
        return horarioDao.findById(horario.getIdHorario()).orElse(null);
    }

    @Override
    public void save(Horario horario) {
       horarioDao.save(horario);
    }

    @Override
    public void delete(Horario horario) {
        
    horarioDao.delete(horario);
    }

}

