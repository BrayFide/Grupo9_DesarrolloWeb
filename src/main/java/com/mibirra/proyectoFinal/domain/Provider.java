/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibirra.proyectoFinal.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "Provider")

public class Provider implements Serializable{
    private static final long serialVersionUID = 1l;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProvider;
    
    
    private String Name;
    private String Phone;
    private String Email;
    private String Address;
    private String Nit;
    private int CreateAuditUser;
    private Date CreateAuditDate;
    private int State;
}
