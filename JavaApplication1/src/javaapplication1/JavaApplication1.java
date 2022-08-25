/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class JavaApplication1 {
    
    public static void main(String[] args) {
        try{
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A do tringulo"));
        int  b = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B do tringulo"));
        int  c  = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C do tringulo"));
         
         
          if (a ==0 || b ==0 || c ==0){
           JOptionPane.showMessageDialog(null, "ERRO 404") ;
          }
           else if ( a==b && b==c)
         { JOptionPane.showMessageDialog(null, "O seu triângulo é equilátero");}
         
         else if ( a==b || b==c || c==a)
          { JOptionPane.showMessageDialog(null, "O seu triângulo é isósceles");}
         
         else  {  JOptionPane.showMessageDialog(null, "O seu triângulo é escaleno");}
         
    }catch(Exception e){  JOptionPane.showMessageDialog(null, "ERRO 404");

    }   
    }
}
   
     
     
   