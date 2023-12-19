
package produçãodeautomoveis.questão1;

import javax.swing.JOptionPane;

public class ProduçãoDeAutomoveisQuestão1 {

   
    public static void main(String[] args) {
       
    int quantidade = 0; 
    int total = 0; 
    int menor = Integer.MAX_VALUE; 
    int dias = 0; 

    
    do {
        
        String input = JOptionPane.showInputDialog("Digite a quantidade produzida em um dia ou -1 para encerrar:");       
        quantidade = Integer.parseInt(input);
 
        if (quantidade >= 0) {
            total += quantidade;
            if (quantidade < menor) {
                menor = quantidade;
            }
            dias++;
        }
    } 
    while (quantidade != -1);

    
    JOptionPane.showMessageDialog(null, "A quantidade produzida no ano todo foi: " + total);
    if (dias > 0) 
    {
        JOptionPane.showMessageDialog(null, "A menor produção diária foi: " + menor);
    } 
    else 
    {
        JOptionPane.showMessageDialog(null, "Não houve dias com produção.");
       }
    }
}
