package somadeserie.questão9;

import javax.swing.JOptionPane;

public class SomaDeSerieQuestão9 {

    public static void main(String[] args) {
    int n, i;
    double soma, termo;
    
    String input = JOptionPane.showInputDialog("Digite a quantidade de termos da série:");
    n = Integer.parseInt(input);
    soma = 0;
   
    for (i = 1; i <= n; i++) 
    {
        termo = i / (11.0 * i + 1);
        soma += termo;
    }
    
    JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
   }
}
