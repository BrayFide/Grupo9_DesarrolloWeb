/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "Product")

public class Product implements Serializable{
    private static final long serialVersionUID = 1l;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProduct;
    
    
    private String Code;
    private String Name;
    private String Description;
    private int Stock;
    private int CreateAuditUser;
    private Date CreateAuditDate;
    private int State;
}
