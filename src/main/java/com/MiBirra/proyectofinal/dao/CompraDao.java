/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.MiBirra.proyectofinal.dao;


import com.MiBirra.proyectofinal.domain.Compra;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author braym
 */
public interface CompraDao  extends JpaRepository<Compra,Long> {
    
    
}