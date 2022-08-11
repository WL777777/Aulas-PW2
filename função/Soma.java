
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package função;

import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class Soma {
        void soma (){
            try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor : "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor : "));
            int res = a + b ;
            JOptionPane.showMessageDialog(null,"O valor da soma: "+res);
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"caracter invalido.");
            }   
    }
        void sub(){
            
        }
}
