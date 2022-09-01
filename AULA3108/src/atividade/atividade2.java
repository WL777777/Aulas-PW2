/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author CAMARGO
 */
public class atividade2 {
     public static void main(String[] args) {
        
      int par =0;
      int impar=0;
             
     
     for (int cont =0; cont <=100; cont++){
         
         
         if(cont%2 ==0){ 
             
        
         par= par  +cont;
         
         }
         
         
         
         else { 
                 
                 
                 impar= impar+cont;
                 }
         
         }
         System.out.println(impar+ ": soma do ímpar" );
         System.out.println(par + ": soma do par");
}}
