/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.ex1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author chams
 */
public class SystemeGestionEtudiants {
  public  ArrayList<Etudiant> Liste;
public SystemeGestionEtudiants(){
    Liste=new ArrayList<>();
}
    public void ajouterEtudiant(String nom,String prenom,Integer ninsc,String email)  {
      Etudiant e = new Etudiant(nom, prenom, ninsc, email);
 Liste.add(e);
  }
       public void afficherEtudiant()  {
      for(Etudiant e:Liste){
          System.out.println(e);
      }
  }
       
       
       
          public void modifierEmailEtudiant(Integer ninsc,String email)  {
     for(Etudiant e:Liste){
          if(Objects.equals(e.getnInsc(), ninsc)){
              e.setEmail(email);
          }
      }
  }
    
        public void supprimerEtudiant(Integer ninsc)  {
     for(int i=0;i<Liste.size();i++){
         Etudiant e=Liste.get(i);
          if(e.getnInsc()== ninsc){
              Liste.remove(i);
             
          }
      }
  }   
  
}
