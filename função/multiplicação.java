package função;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class multiplicação {
        void mult (){
            try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor : "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor : "));
            int res = a * b ;
            JOptionPane.showMessageDialog(null,"O valor da  multiplicação: "+res);
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"caracter invalido.");
            }  
        }
    }