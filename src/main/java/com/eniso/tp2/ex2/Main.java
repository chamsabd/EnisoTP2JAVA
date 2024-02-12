/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.ex2;

/**
 *
 * @author chams
 */
public class Main {
    public static void main(String[] args){
        Livre l1=new Livre();
        System.out.println(l1);
              Livre l2=new Livre("titre1","auteur1");
                   System.out.println(l2);    
              Livre l3=new Livre("titre2","auteur2",2023);
                                            System.out.println(l3);
              Livre l4=new Livre("titre3","auteur3",2024,1254);
                                             System.out.println(l4);
    }
}
