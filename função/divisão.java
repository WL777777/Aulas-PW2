package função;
import javax.swing.JOptionPane;
/**
 *
 * @author CAMARGO
 */
public class divisão{
        void div (){
            try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor : "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor : "));
            int res = a / b ;
            JOptionPane.showMessageDialog(null,"O valor da divisão  : "+res);
            }catch (Exception e){
                 JOptionPane.showMessageDialog(null,"caracter invalido.");
            }  
        }
}
