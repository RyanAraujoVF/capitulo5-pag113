
package quintapotencia.questão.pkg5;

import javax.swing.JOptionPane;

public class QuintaPotenciaQuestão5 {

    
    public static void main(String[] args) {
        double numero;     
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));   
        
        double potencia = Math.pow(numero, 5);
        JOptionPane.showMessageDialog(null, "O número elevado a quinta potência é: " + potencia);
    }
}