
package potenciadexy.questão6;

import javax.swing.JOptionPane;

public class PotenciaDeXYQuestão6 {

    
    public static void main(String[] args) {
        double X, Y;
 
        X = Double.parseDouble(JOptionPane.showInputDialog("Digite o número X:"));
        Y = Double.parseDouble(JOptionPane.showInputDialog("Digite a potência Y:"));
                
        double potencia = Math.pow(X, Y);
                
        JOptionPane.showMessageDialog(null, "O número X elevado a potência Y é: " + potencia);
    }
}