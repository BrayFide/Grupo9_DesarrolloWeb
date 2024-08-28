package com.MiBirra.proyectofinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

@Data
@Entity
@Table(name = "menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private Long idMenu;
    private String nombrePlato;
    private String tipo;
    private String descripcion;
    private int precio;
    private String ruta_imagen;
    private boolean activo;

    // Constructor sin argumentos
    public Menu() {}

    // Constructor con idMenu
    public Menu(Long idMenu) {
        this.idMenu = idMenu;
    }
}
