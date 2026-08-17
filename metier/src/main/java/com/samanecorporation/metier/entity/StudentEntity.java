package com.samanecorporation.metier.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {
    @Id
    @Column(name = "matricule", length = 30, nullable = false)
    private String matricule;

    @Column(name = "nom", length = 120, nullable = false)
    private String nom;

    @Column(name = "prenom", length = 120, nullable = false)
    private String prenom;

    @Column(name = "numero_telephone", length = 30, nullable = false)
    private String numeroTelephone;

    public StudentEntity() {
    }

    public StudentEntity(String matricule, String nom, String prenom, String numeroTelephone) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
