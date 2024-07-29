/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MiBirra.proyectofinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

@Data
@Entity
@Table(name = "mesa")

public class Mesa implements Serializable{
    
    
    private static final long serialVersionUID = 1l;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa")
    private Long idMesa;
    
    
    private String pedido;
   private String itemsMenu;
   private int total;
   private String nombreCliente;
   private String metodoPago;
    private boolean activo;
    
    
    
}
