/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mibirra.proyectoFinal.dao;



import com.mibirra.proyectoFinal.domain.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author braym
 */
public interface MesaDao  extends JpaRepository<Mesa,Long> {
    
    
}
