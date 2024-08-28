package com.MiBirra.proyectofinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "IdUser")
private Long IdUser;


    @Column(name = "NIT")
    private String NIT; // ruta imagen

    @Column(name = "Username")
    private String username; // cambiado a minúsculas


    @Column(name = "Pass")
    private String pass;

    @Column(name = "Address") // email
    private String address;

   @ManyToOne
@JoinColumn(name = "id_rol")
private Rol rol;

}
