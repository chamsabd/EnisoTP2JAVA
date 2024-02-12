/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.ex2;

/**
 *
 * @author chams
 */
public class Livre {
    private String titre;
    private String auteur;
    public Integer pubyear;
        public Integer isbn;
        public Livre(){
    this.titre="";
    this.auteur="";
    this.isbn=0;
    this.pubyear=0;
}
        public Livre(String titre,String auteur){
    this.titre=titre;
    this.auteur=auteur;
    this.isbn=0;
    this.pubyear=0;
}
        
        public Livre(String titre,String auteur,Integer pubyear){
    this.titre=titre;
    this.auteur=auteur;
    this.isbn=0;
    this.pubyear=pubyear;
}
public Livre(String titre,String auteur,Integer pubyear,Integer isbn){
    this.titre=titre;
    this.auteur=auteur;
    this.isbn=isbn;
    this.pubyear=pubyear;
}
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Integer getPubyear() {
        return pubyear;
    }

    public void setPubyear(Integer pubyear) {
        this.pubyear = pubyear;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", pubyear=" + pubyear + ", isbn=" + isbn + '}';
    }
        
      
        
}
