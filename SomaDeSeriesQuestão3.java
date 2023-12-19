
package somadeseries.questão3;

import javax.swing.JOptionPane;

public class SomaDeSeriesQuestão3 {

    public static void main(String[] args) {
        int N;
        double soma = 0;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        for (int i = 1; i <= N; i++) 
        {
            double termo = 1.0 / (2 * i);
            soma = soma + termo;
        }              
        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }
}