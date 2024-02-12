/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.ex1;


public class Etudiant {
    private String nom;
    private String prenom;
    private Integer nInsc;
    private String email;

    public Etudiant(String nom, String prenom, Integer nInsc, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.nInsc = nInsc;
        this.email = email;
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

    public Integer getnInsc() {
        return nInsc;
    }

    public void setnInsc(Integer nInsc) {
        this.nInsc = nInsc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "nom=" + nom + ", prenom=" + prenom + ", nInsc=" + nInsc + ", email=" + email + '}';
    }

  
    
    
}
