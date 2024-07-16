package com.mibirra.proyectoFinal.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRol")
    private int idRol;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CreateAuditUser", nullable = false)
    private int createAuditUser;

    @Column(name = "CreateAuditDate", nullable = false)
    private Date createAuditDate;

    @Column(name = "UpdateAuditUser")
    private Integer updateAuditUser;

    @Column(name = "UpdateAuditDate")
    private Date updateAuditDate;

    @Column(name = "DeleteAuditUser")
    private Integer deleteAuditUser;

    @Column(name = "DeleteAuditDate")
    private Date deleteAuditDate;

    @Column(name = "State", nullable = false)
    private int state;

    // Getters and setters

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreateAuditUser() {
        return createAuditUser;
    }

    public void setCreateAuditUser(int createAuditUser) {
        this.createAuditUser = createAuditUser;
    }

    public Date getCreateAuditDate() {
        return createAuditDate;
    }

    public void setCreateAuditDate(Date createAuditDate) {
        this.createAuditDate = createAuditDate;
    }

    public Integer getUpdateAuditUser() {
        return updateAuditUser;
    }

    public void setUpdateAuditUser(Integer updateAuditUser) {
        this.updateAuditUser = updateAuditUser;
    }

    public Date getUpdateAuditDate() {
        return updateAuditDate;
    }

    public void setUpdateAuditDate(Date updateAuditDate) {
        this.updateAuditDate = updateAuditDate;
    }

    public Integer getDeleteAuditUser() {
        return deleteAuditUser;
    }

    public void setDeleteAuditUser(Integer deleteAuditUser) {
        this.deleteAuditUser = deleteAuditUser;
    }

    public Date getDeleteAuditDate() {
        return deleteAuditDate;
    }

    public void setDeleteAuditDate(Date deleteAuditDate) {
        this.deleteAuditDate = deleteAuditDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
