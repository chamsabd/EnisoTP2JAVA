/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.ex1;

import java.util.Scanner;

/**
 *
 * @author chams
 */
public class TP2 {

    public static void main(String[] args) {
        Integer q=-1;
        Scanner x=new Scanner(System.in);
      SystemeGestionEtudiants test=new SystemeGestionEtudiants();
      while(q!=0){

      System.out.println("***********************");  
       System.out.println("1:ajouter etudiant");  
        System.out.println("2:afficher etudiants");  
          System.out.println("3:modifier email etudiant");  
          System.out.println("4:supprimer etudiant");  
          System.out.println("5:quitter");  
         q= x.nextInt();
      switch(q){ 
               case 1: System.out.println("Ajouter Etudiant "); 
                   System.out.println("donner nom");  
                   String nom=x.next();
                    System.out.println("donner prenom");  
                   String prenom=x.next();
                    System.out.println("donner email");  
                   String email=x.next();
                    System.out.println("donner nInsc");  
                   Integer  nInsc=x.nextInt();
                   test.ajouterEtudiant(nom, prenom, nInsc, email);
                   
                   break;
                    case 2: test.afficherEtudiant();break;
                         case 3:
                             
                              System.out.println("donner nInsc");  
                     nInsc=x.nextInt();
                     System.out.println("donner email");  
                    email=x.next();
                             test.modifierEmailEtudiant(nInsc, email);
                             break;
                              case 4: 
                                    System.out.println("donner nInsc");  
                     nInsc=x.nextInt();
                     test.supprimerEtudiant(nInsc);
                                  break;
                              case 5:q=0; break;
      }
      }
    }
    
}
