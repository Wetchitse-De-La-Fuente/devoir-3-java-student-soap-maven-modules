package com.samanecorporation.metier.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {"matricule", "nom", "prenom", "numeroTelephone"})
public class StudentDto implements Serializable {
    @XmlElement(name = "matricule", required = true)
    private String matricule;

    @XmlElement(name = "nom", required = true)
    private String nom;

    @XmlElement(name = "prenom", required = true)
    private String prenom;

    @XmlElement(name = "numeroTelephone", required = true)
    private String numeroTelephone;

    public StudentDto() {
    }

    public StudentDto(String matricule, String nom, String prenom, String numeroTelephone) {
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
