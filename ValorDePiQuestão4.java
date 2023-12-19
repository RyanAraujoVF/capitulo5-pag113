
package valordepi.questão4;

import javax.swing.JOptionPane;

public class ValorDePiQuestão4 {

    
    public static void main(String[] args) {
        double pi = 0;
        int sinal = 1;
        int denominador = 1;
        int termos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série:"));
        
        for (int i = 1; i <= termos; i++) 
        {
            double termo = 4.0 / denominador * sinal; 
            pi = pi + termo;           
            sinal = -sinal;  
            denominador = denominador + 2;
        }
        JOptionPane.showMessageDialog(null, "O valor de PI é: " + pi);
    }
}
    
    

