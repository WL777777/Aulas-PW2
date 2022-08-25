/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import javax.swing.JOptionPane;


/**
 *
 * @author CAMARGO
 */
public class JavaApplication2 {
    public static void main(String[] args) {   
    
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
    int  b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
    int  c  = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
    
    
    if( a <= b && a <=c && b <= c  ){
        System.out.println("ABC \n" +a+"\n"+b+"\n"+c);}
        
     else if( a <= b && b >= c && c >= a   ){
        System.out.println("ACB \n"+a+"\n"+c+"\n"+b);}
    
     else if( b <= a && a <= c && c >= b   ){
        System.out.println("BAC \n"+b+"\n"+a+"\n"+c);}
     
     else if( b <= a && b <= c && c <= a   ){
        System.out.println("BCA \n"+b+"\n"+c+"\n"+a);}
    
    else if( c <= a && b >= c && a <= b   ){
        System.out.println("CAB \n"+c+"\n"+a+"\n"+b);}
    
    else if( c <= a && c <= b && b <= a   ){
        System.out.println("CBA \n"+c+"\n"+b+"\n"+a);}
    
    
    
    
    }
    
}       




