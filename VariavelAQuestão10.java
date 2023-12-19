package variavela.questão10;

import javax.swing.JOptionPane;


public class VariavelAQuestão10 {

    public static void main(String[] args) {
    int A, i, cont; 
    cont = 0;
    for (i = 1; i <= 5; i++) 
    {
        String input = JOptionPane.showInputDialog("Digite um valor para A:");
        A = Integer.parseInt(input);
        
        if (A < 0) 
        {
            cont++;
        }
    }
    JOptionPane.showMessageDialog(null, "O número de valores negativos é: " + cont);
 }
}
