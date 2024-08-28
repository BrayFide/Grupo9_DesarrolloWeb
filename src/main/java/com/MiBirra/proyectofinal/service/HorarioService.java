
package com.MiBirra.proyectofinal.service;


import com.MiBirra.proyectofinal.domain.Horario;
import java.util.List;

/**
 *
 * @author braym
 */
public interface HorarioService {
//Se enuncia un metodo que recupera los registros de la
    //tabla horario dentro de un ArrayList, pueden
    //ser todos los registros o solo los activos
    
    public List<Horario> getHorarios(boolean activos);
    
    //Se obtiene un registro de la tabla horario en un objeto horario 
    //Si el IdHorario existe si no se pasa un null
    
    public Horario getHorario(Horario horario);
    
    // Se crea un nuevo registro en horario si el objeto Horario no tiene
    //idHorario osea esta vacio, se actualiza el registro en la tabla
    //Horario si el objeto Horario tiene un idHorario
    
    public void save (Horario horario);
    
    //Se elimina el registro que tiene idHorario
    
    public void delete (Horario horario);
    }